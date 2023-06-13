package com.example.homework.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.homework.domain.User;

import java.util.List;

public interface IUserService {
    List<User> FindUserList(QueryWrapper<User> wrapper);
}
