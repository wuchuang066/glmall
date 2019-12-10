package com.zpark.user.service;

import com.zpark.user.entity.UmsMemberReceiveAddress;

import java.util.List;

public interface UmsMemberReceiveAddressService {

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Integer memberId);
}
