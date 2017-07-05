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
@ContextConfiguration(locations = "classpath:redis-client-context.xml")
@TestPropertySource(locations = "classpath:conf/redis-client.properties")
public class RedisServiceClientTest {

    @Autowired
    private RedisServiceClient redisServiceClient;

    @Test
    public void test() {
        assertNotNull(redisServiceClient);
        assertEquals("redis_user", redisServiceClient.getUsername());
    }

}