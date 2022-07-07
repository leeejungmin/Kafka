//package com.example.tasty.user.service;
//
//import com.example.tasty.user.model.UserDto;
//import com.google.firebase.remoteconfig.internal.TemplateResponse;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.util.UriComponentsBuilder;
//
//import java.net.URI;
//
//@Service
//public class RestTemplateService {
//
//    public ResponseEntity<UserDto> postDto(){
//        // uri 주소 생성
//        URI uri = UriComponentsBuilder
//                .fromUriString("http://localhost:8000") //http://localhost에 호출
//                .path("/user/createe")
//                .queryParam("userId", "jungjungjung")
//                .queryParam("phoneNum", "01022334455")
//                .queryParam("name", "jungmin")
//                .queryParam("password", "123")
//                .encode()
//                .build()
//                .toUri();
//
//        System.out.println("check uri dto"+uri);
//        UserDto userDto = new UserDto();
//        userDto.setPassword("123");
//        RestTemplate restTemplete = new RestTemplate();
//
//        ResponseEntity<UserDto> result = restTemplete.postForEntity(uri, userDto, UserDto.class);
//        System.out.println("about result................"+result);
//        System.out.println(result.getStatusCode());
//        System.out.println(result.getBody());
//
//        return result;
//    }
//
//}
