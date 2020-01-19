package com.so.picture.user.service;


import com.so.picture.user.entry.User;
import com.so.picture.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getMovieByID(int userId){
        return userMapper.queryUserById(userId);
    }
}
