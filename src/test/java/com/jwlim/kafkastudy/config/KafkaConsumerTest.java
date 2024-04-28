package com.jwlim.kafkastudy.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;

import java.util.Map;
import java.util.concurrent.TimeUnit;

@SpringBootTest
@EmbeddedKafka(partitions = 1,
        brokerProperties = {"listeners=PLAINTEXT://localhost:9092"},
        ports = { 9092 }
)
class KafkaConsumerTest {

//    @Autowired
//    private KafkaConsumer consumer;

    @Autowired
    private KafkaProducer producer;

    @Test
    public void giveEmbeddedKafkaBroker_whenSendingWithSimpleProducer_thenMessageReceived()
            throws Exception {

//        String topic = "baeldung";
//
//        Map<String,Object> payload = Map.of(
//                "name", "my_name",
//                "age", 27,
//                "id", 123
//                );
//        Map<String,Object> payload2 = Map.of(
//                "name", "my_name",
//                "age", 25,
//                "id", 1234
//        );
//        int testCnt = 0;
//        for (int i = 0; i < 10; i++) {
//            if (testCnt % 2 == 0) {
//                producer.send(topic, payload);
//            } else {
//                producer.send(topic, payload2);
//            }
//            testCnt++;
//        };
//
//        // 모든 메시지를 수신할 때까지 기다립니다.
//        consumer.getLatch().await(10, TimeUnit.SECONDS);
//
//        System.out.println("============================================================");
//        System.out.println(consumer.getPayloads().size());
//        System.out.println(consumer.getPayloads());


    }

}