package com.example.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class RabbitMqService {
    @Value("${rabbitmq.queue.name}")
    private String queueName;


    //Queue에서 메세지 구독
    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void receiveMessage(RabbitMessage rabbitMessage){
        log.info("Received Message : {}", rabbitMessage.toString());
    }
}
