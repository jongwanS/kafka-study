package com.jwlim.kafkastudy.controller;

import com.jwlim.kafkastudy.config.KafkaProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class KafkaController {

    private final KafkaProducer producer;

//    KafkaController(KafkaProducer producer){
//        this.producer = producer;
//    }



    @GetMapping("/send-message")
    public String sendMessage() {
        log.info("message : {}", "Hello, Kafka");
        this.producer.sendMessage("Hello, Kafka");

        return "success";
    }
}
