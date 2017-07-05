package org.coderearth.kitchen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

/**
 * Created by kunal_patel on 4/13/17.
 */

public class MainApplication {

    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");
        final RabbitMqServiceClient serviceClient = context.getBean("rabbitServiceClient", RabbitMqServiceClient.class);
        Assert.notNull(serviceClient, "RabbitMqServiceClient cannot be null !!");
        Assert.state(serviceClient.getTimeout() > 0, "timeout cannot be 0");
        System.out.println(serviceClient.getTimeout());
        System.out.println(serviceClient.getRetryThreshold());

        RedisServiceClient redisServiceClient = context.getBean("redisServiceClient", RedisServiceClient.class);
        Assert.notNull(redisServiceClient, "RedisServiceClient cannot be null !!");
    }

}
