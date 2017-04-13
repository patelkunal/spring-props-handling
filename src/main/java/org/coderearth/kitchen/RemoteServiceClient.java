package org.coderearth.kitchen;

/**
 * Created by kunal_patel on 4/13/17.
 */
public class RemoteServiceClient {

    private final String username;
    private final String password;
    private final int timeout;
    private final int retryThreshold;

    public RemoteServiceClient(String username, String password, int timeout, int retryThreshold) {
        this.username = username;
        this.password = password;
        this.timeout = timeout;
        this.retryThreshold = retryThreshold;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getTimeout() {
        return timeout;
    }

    public int getRetryThreshold() {
        return retryThreshold;
    }
}
