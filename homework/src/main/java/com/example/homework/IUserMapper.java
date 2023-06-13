package com.example.homework;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.homework.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserMapper  extends  BaseMapper<User> {
}
