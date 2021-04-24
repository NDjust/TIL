package me.nathan.demorabbitmq.service;

import me.nathan.demorabbitmq.model.CustomMessage;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class CustomMessageListener {

    @RabbitListener(queues = "spring-boot")
    public void receiveMessage(final CustomMessage customMessage) {
        System.out.println(customMessage);
    }


}
