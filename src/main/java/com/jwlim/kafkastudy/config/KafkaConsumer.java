package com.jwlim.kafkastudy.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumer {

    @KafkaListener(topics = "exam-topic", groupId = "")
    public void flightEventConsumer(Object message) {
        log.info("Consumer consume Kafka message -> {}", message);

        // write your handlers and post-processing logic, based on your use case
    }

}
