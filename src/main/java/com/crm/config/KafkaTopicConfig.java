package com.crm.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic NewTransaction() {
        return TopicBuilder.name("new-transaction").build();
    }


    @Bean
    public NewTopic ValidTransaction() {
        return TopicBuilder.name("valid-transaction").build();
    }


    @Bean
    public NewTopic InvalidTransaction() {
        return TopicBuilder.name("invalid-transaction").build();
    }

}
