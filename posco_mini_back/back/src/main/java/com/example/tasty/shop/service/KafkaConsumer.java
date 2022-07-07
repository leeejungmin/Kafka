package com.example.tasty.shop.service;

import com.example.tasty.shop.model.ShopDto;
import com.example.tasty.shop.repository.ShopListMapper;
import com.example.tasty.user.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class KafkaConsumer {
//    @KafkaListener(topics = "shopTopic", groupId = "jung")
//    public List<ShopDto> getShopList(String message) throws Exception {
//
//
//        ShopListMapper shopListMapper;
//
//        System.out.println(message);
//        System.out.println("receive message : " + message);
//
//        return ShopListMapper.getShopList();
//
//    }

//    @KafkaListener(topics = "jungTopic", groupId = "jung")
//    public void consume(String message) throws IOException {
//        System.out.println("jung's receive message : " + message);
//
//    }

    @KafkaListener(topics = "jungTopic", groupId = "jung")
    public void consume(String message) throws IOException {
        System.out.println("jung's receive message : " + message);
        //System.out.println("jung's userDto : " + message.getUserId());
    }
}
