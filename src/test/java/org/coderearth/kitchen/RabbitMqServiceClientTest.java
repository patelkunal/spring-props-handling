package org.coderearth.kitchen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by kunal_patel on 4/13/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:rabbitmq-client-context.xml")
@TestPropertySource(locations = "classpath:conf/rabbitmq-client.properties")
public class RabbitMqServiceClientTest {

    @Autowired
    private RabbitMqServiceClient serviceClient;

    @Test
    public void test() {
        assertNotNull(serviceClient);
        assertEquals("admin", serviceClient.getUsername());
        assertEquals(3, serviceClient.getRetryThreshold());
    }

}