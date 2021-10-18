package com.example.springbootkafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    private final String TOPIC = "myTopic";

    public void publish(String message){
        //System.out.println(message +" for producer checking");
        kafkaTemplate.send(TOPIC,message);
    }
}
