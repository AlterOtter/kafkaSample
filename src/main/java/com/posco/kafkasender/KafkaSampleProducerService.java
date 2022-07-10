package com.posco.kafkasender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSampleProducerService {

    //RestTemplate(Openfeign) 처럼 Kafka와 통신할수 있게 해주는 녀석
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message){
        System.out.println("send Message"+message);
        this.kafkaTemplate.send("test-topic",message);
    }
}
