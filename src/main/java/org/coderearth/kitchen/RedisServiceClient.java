package org.coderearth.kitchen;

/**
 * Created by kunal_patel on 4/13/17.
 */
public class RedisServiceClient {

    private final String username;
    private final String password;
    private final String[] recipients;

    public RedisServiceClient(String username, String password, String[] recipients) {
        this.username = username;
        this.password = password;
        this.recipients = recipients;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String[] getRecipientsArray() {
        return recipients;
    }

    public String getRecipients() {
        return String.join("; ", recipients);
    }
}
