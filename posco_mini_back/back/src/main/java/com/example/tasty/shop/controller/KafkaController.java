package com.example.tasty.shop.controller;

import com.example.tasty.shop.service.KafkaProducer;
import com.example.tasty.user.model.UserDto;
import io.swagger.models.Model;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParser;
import org.springframework.web.bind.annotation.*;
import com.example.tasty.shop.model.ShopDto;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@RestController
@Slf4j
@RequestMapping("kafka")
public class KafkaController {
    private final KafkaProducer producer;

    @Autowired
    KafkaController(KafkaProducer producer) {
        this.producer = producer;
    }

    @PostMapping( "/sendMessage")
    public String sendMessage(@RequestBody ShopDto shopDto) {
        System.out.println("message...."+shopDto);
        this.producer.sendMessage(shopDto.toString());
        // consume();
        //this.producer.sendMessage(message);

        return shopDto.toString();
    }

    @PostMapping( "/login")
    public String sendMessage(@RequestBody HashMap<String, String> map) {
        System.out.println("login...."+map);
        //JsonParser jparser = new JsonParser();
        //this.producer.sendMessage(userDto.toString());
        //this.producer.sendMessage(jparser(map));
        // consume();
        //this.producer.sendMessage(message);

        return map.toString();
    }

}
