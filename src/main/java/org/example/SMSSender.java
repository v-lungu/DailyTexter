package org.example;

public class SMSSender {

    static {
        Twilio.init(Config.TWILIO_ACCOUNT_SID, Config.TWILIO_AUTH_TOKEN);
    }

}
