package com.example.tasty.user.repository;

import com.example.tasty.user.model.UserMDto;

public interface MongoRepo {
    UserMDto getLoginByUserIdAndPassword(UserMDto userMDto);
}
