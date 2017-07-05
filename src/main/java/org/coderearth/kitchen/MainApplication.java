package org.coderearth.kitchen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.stream.Stream;

/**
 * Created by kunal_patel on 4/13/17.
 */

public class MainApplication {

    private static final Logger LOGGER =  LoggerFactory.getLogger(MainApplication.class);

    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");
        final RabbitMqServiceClient serviceClient = context.getBean("rabbitServiceClient", RabbitMqServiceClient.class);
        Assert.notNull(serviceClient, "RabbitMqServiceClient cannot be null !!");
        Assert.state(serviceClient.getTimeout() > 0, "timeout cannot be 0");
        LOGGER.info("timeout ==> {}", serviceClient.getTimeout());
        LOGGER.info("retry threshold ==> {}", serviceClient.getRetryThreshold());

        RedisServiceClient redisServiceClient = context.getBean("redisServiceClient", RedisServiceClient.class);
        Assert.notNull(redisServiceClient, "RedisServiceClient cannot be null !!");

        LOGGER.info("recipients ==> {}", redisServiceClient.getRecipients());
        Stream.of(redisServiceClient.getRecipientsArray()).forEach(e -> LOGGER.info("{}", e));
    }

}
