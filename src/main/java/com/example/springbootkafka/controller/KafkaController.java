package com.example.springbootkafka.controller;


import com.example.springbootkafka.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/kafka")
@RestController
public class KafkaController {

    @Autowired
    private Producer producer;

    @PostMapping ("/post")
    public void getMessage(@RequestParam("message") String message){
        //System.out.println(message +"for rest checking");
        producer.publish(message);
    }
}
