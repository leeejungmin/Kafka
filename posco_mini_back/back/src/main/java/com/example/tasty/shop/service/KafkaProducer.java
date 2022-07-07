package com.example.tasty.shop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;
//
//
//
//    public void KafkaProducer(KafkaTemplate kafkaTemplate){
//        this.kafkaTemplate = kafkaTemplate;
//    }

//    public void searchShopList()
//    {
//        KafkaTemplate<String, Object> kafkaTemplate = new KafkaTemplate();
//        kafkaTemplate.send("jungTopic", "hello");
//    }

    public void sendMessage(String message) {
//        KafkaTemplate<String, Object> kafkaTemplate = new KafkaTemplate();
        System.out.println(String.format("Produce message : %s", message));
        kafkaTemplate.send("jungTopic", message);
    }

//    @Bean
//    public KafkaAdmin admin() {
//        Map<String, Object> configs = new HashMap<>();
//        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG);
//        return new KafkaAdmin(configs);
//    }

}
