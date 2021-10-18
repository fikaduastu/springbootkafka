package com.example.springbootkafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "myTopic", groupId = "myGroup")
    public void consumeFromKafka(String message){
        System.out.println(message);
    }
}
