package com.example.homework.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.homework.IUserMapper;
import com.example.homework.domain.User;
import com.example.homework.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl  implements IUserService {
    @Autowired
    private IUserMapper ium;

    @Override
    public List<User> FindUserList(QueryWrapper<User> wrapper) {
        return ium.selectList(wrapper);
    }
}
