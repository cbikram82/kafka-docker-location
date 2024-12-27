package com.spring.bikram.kafkaTestUser.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserLocationService {
    @KafkaListener(topics = "driver-location", groupId = "user-group")
    public void cabLocation(String location) {
        System.out.println(location);
    }
}
