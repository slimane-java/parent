package com.example.demoServer1.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "demo.kafka")
public class KafkaProps {
    private String topic;
}
