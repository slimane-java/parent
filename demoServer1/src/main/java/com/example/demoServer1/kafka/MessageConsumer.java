package com.example.demoServer1.kafka;

import com.example.demoServer1.config.KafkaProps;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Log4j2
public class MessageConsumer {
    private final MessageRepository messageRepository;
    private final KafkaProps kafkaProps;

    @KafkaListener(topics = "${demo.kafka.topic}", groupId = "xyz")
    public void consum(String message){
        log.info("message recive" + message);
        messageRepository.addMessage(message);
    }
}
