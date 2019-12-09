package com.zpark.user.service.impl;

import com.zpark.user.entity.UmsMember;
import com.zpark.user.mapper.UserMapper;
import com.zpark.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wuc
 * @date 2019/11/14 21:40
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

}
