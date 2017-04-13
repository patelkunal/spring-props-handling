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
        final RemoteServiceClient serviceClient = context.getBean("serviceClient", RemoteServiceClient.class);
        Assert.notNull(serviceClient, "RemoteServiceClient cannot be null !!");
        Assert.state(serviceClient.getTimeout() > 0, "timeout cannot be 0");
        System.out.println(serviceClient.getTimeout());
        System.out.println(serviceClient.getRetryThreshold());
    }

}
