package me.nathan.demorabbitmq.service;

import me.nathan.demorabbitmq.model.CustomMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private static final String topicExchange = "spring-boot-exchange";

    private final RabbitTemplate rabbitTemplate;

    public Runner(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Sending Message...");
        CustomMessage message = new CustomMessage("Hello nathan", 1, true);
        rabbitTemplate.convertAndSend(topicExchange, "foo.bar.baz", message);
    }
}
