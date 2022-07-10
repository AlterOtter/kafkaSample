package com.posco.kafkasender;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaSampleConsumerService {

    @KafkaListener(topics = "test-topic",groupId = "group-id-oing")
    public void consume(String message) throws IOException{
        System.out.println("Receive message : "+message);
    }
}
