package org.coderearth.kitchen;

/**
 * Created by kunal_patel on 4/13/17.
 */
public class RedisServiceClient {

    private final String username;
    private final String password;

    public RedisServiceClient(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
