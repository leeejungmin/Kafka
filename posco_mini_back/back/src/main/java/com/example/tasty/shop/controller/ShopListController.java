package com.example.tasty.shop.controller;

import com.example.tasty.shop.model.Shop;
import com.example.tasty.shop.model.ShopDto;
import com.example.tasty.shop.service.KafkaProducer;
import com.example.tasty.shop.service.ShopListServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping("shop")
public class ShopListController {

    @Autowired
    ShopListServiceImpl shopListService;

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping(value = "/sendMessage")
    public void sendMessage(String message) {
        System.out.println("send message..... : " +  message);

        this.kafkaProducer.sendMessage(message);
    }

//    @PostMapping(value = "/sendMessage")
//    public ApplicationRunner runner(KafkaTemplate<String, String> template) {
//
//        System.out.println("producer......."+template);
//      return (ApplicationRunner) template.send("jung", "test.......goood");
//    }
    @GetMapping("/")
    public List<Shop> getShopList(){

        //log.info(shopListService.getShopList().toString());
        return shopListService.getShopList();
    }

    @GetMapping("/rate")
    public List<ShopDto> getShopRate(){

        return shopListService.getShopGrade();
    }




}