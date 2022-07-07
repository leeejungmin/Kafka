package com.example.tasty.user.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("event")
@Getter
@Setter
public class UserMDto {

    @Id
    private String _id;
    private String userId;
    private String password;
    private String phoneNum;
    private String name;

}
