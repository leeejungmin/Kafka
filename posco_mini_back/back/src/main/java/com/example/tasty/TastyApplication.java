package com.example.tasty;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class TastyApplication {

	public static void main(String[] args) {
		SpringApplication.run(	TastyApplication.class, args);
	}

	CommandLineRunner commandLineRunner(KafkaTemplate<String, Object> kafkaTemplate ){
		return args -> {
			kafkaTemplate.send("jungTopic", "helloo");
		};
	}
//	@Bean
//	public KafkaAdmin admin() {
//		Map<String, Object> configs = new HashMap<>();
//		configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "jung");
//		return new KafkaAdmin(configs);
//	}
//
//	@Bean
//	public NewTopic topic() {
//		return TopicBuilder.name("jung")
//				.partitions(10)
//				.replicas(1)
//				.build();
//	}
//
//	@KafkaListener(groupId = "jung", topics = "jungTopic")
//	public void listen(String in) {
//		System.out.println(in);
//	}


//	}
}
