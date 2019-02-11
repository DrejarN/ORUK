/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oruk;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 *
 * @author Jamie
 */
public class SMS {
    
    public static final String ACCOUNT_SID = "AC288dd4d72910dd84563c1acd6a3eaf5b";
    public static final String AUTH_TOKEN = "8a421debd6b75db9445d64f8c5d70a6b";

    public static void main(String[] args) { //Main metod finns bara för test.
    //public void sendText() {    
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+46707953676"), //Mottagare 
                new com.twilio.type.PhoneNumber("+46769438479"), //Twilio number
                "HELLO THIS IS ORUK CALLI.. Erhm, TEXTING!")
            .create();

        System.out.println(message.getSid());
    }
    
}
