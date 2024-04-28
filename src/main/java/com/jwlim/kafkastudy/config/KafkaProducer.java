package com.jwlim.kafkastudy.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
@Slf4j
@RequiredArgsConstructor
public class KafkaProducer {

    private static final String TOPIC = "exam-topic";

    @Autowired
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info("Produce message : {}", message);
        CompletableFuture<SendResult<String, String>> k = this.kafkaTemplate.send(TOPIC, message);
        log.info(k.toString());
    }
}
