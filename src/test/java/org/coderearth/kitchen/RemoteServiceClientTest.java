package org.coderearth.kitchen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by kunal_patel on 4/13/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource(locations = "classpath:conf/service-client.properties")
@ContextConfiguration(locations = "classpath:service-client-context.xml")
public class RemoteServiceClientTest {

    @Autowired
    private RemoteServiceClient serviceClient;

    @Test
    public void test() {
        assertNotNull(serviceClient);
    }

}