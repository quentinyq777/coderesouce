package com.sany.message.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
public class ReceiverService {

    @JmsListener(destination = "demo",containerFactory = "mqFactory")
    public void receiveMessageDemo(String message) {
        System.err.println("Received <" + message + ">");
    }
    
    @JmsListener(destination = "demo1",containerFactory = "mqFactory")
    public void receiveMessageDemo1(String message) {
        System.err.println("Received <" + message + ">");
    }
}