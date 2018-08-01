package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
	@Autowired
	
    @JmsListener(destination = "mailbox", containerFactory = "consumerJmsConnectionFactory")
    public void receiveMessage(Email email) {
        System.out.println("Received <" + email + ">");
    }

}