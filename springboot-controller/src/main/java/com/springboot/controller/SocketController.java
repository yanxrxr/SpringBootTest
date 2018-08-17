package com.springboot.controller;

import com.springboot.messages.InputMessage;
import com.springboot.messages.OutputMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SocketController {

    @Autowired
    private SimpMessageSendingOperations messagingTemplate;

    @MessageMapping("/request")
//    @SendTo("topic/greeting")
    public void greeting(InputMessage inputMessage) throws InterruptedException {
//        Thread.sleep(1000);
        System.out.println(inputMessage.getName());
        messagingTemplate.convertAndSend("/topic/greeting", inputMessage.getName());
//        return new OutputMessage("Hello, " + inputMessage.getName() + "!");
    }
}
