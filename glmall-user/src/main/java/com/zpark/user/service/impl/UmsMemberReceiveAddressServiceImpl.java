package com.zpark.user.service.impl;

import com.zpark.user.entity.UmsMemberReceiveAddress;
import com.zpark.user.mapper.UmsMemberReceiveAddressMapper;
import com.zpark.user.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @ClassName UmsMemberReceiveAddressServiceImpl
 * @Description TODO
 * @Author
 * @Date 2019/12/10 20:14
 * @Version 1.0
 */
@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Integer memberId) {
        // 1. 创建一个Example的实例 并指定泛型
        // 2.  给该Example 添加条件

        Example e = new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId",memberId);
        return this.umsMemberReceiveAddressMapper.selectByExample(e);
    }
}
