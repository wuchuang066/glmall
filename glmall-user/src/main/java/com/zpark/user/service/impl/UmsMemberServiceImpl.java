package com.zpark.user.service.impl;

import com.zpark.user.entity.UmsMember;
import com.zpark.user.mapper.UmsMemberMapper;
import com.zpark.user.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wuc
 * @date 2019/11/17 22:12
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    private UmsMemberMapper memberMapper;

    @Override
    public List<UmsMember> quertAllUser() {
        return this.memberMapper.selectAll();
    }
}
