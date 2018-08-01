package com.tp.jms.activemq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MailboxListener implements MessageListener 
{ 
    public void onMessage(Message message)
    {
        try 
        {   
            if (message instanceof TextMessage) 
            {
                TextMessage txtMsg = (TextMessage)message;
                System.out.println("Received message from Destination : " + txtMsg.getText());				
            }
        } 
        catch (JMSException e) { }
    }

}