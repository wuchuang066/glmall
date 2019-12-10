package com.zpark.user.controller;

import com.zpark.user.entity.UmsMemberReceiveAddress;
import com.zpark.user.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UmsMemberReceiveAddressController
 * @Description TODO
 * @Author
 * @Date 2019/12/10 20:15
 * @Version 1.0
 */
@RestController
@RequestMapping("receiveAddress")
public class UmsMemberReceiveAddressController {

    @Autowired
    private UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    /**
     * 功能描述 根据memberId 查询该用户的收货地址
     *
     * @param memberId
     * @return java.util.List<com.zpark.user.entity.UmsMemberReceiveAddress>
     * @author
     * @date 2019/12/10 20:18
     */
    @RequestMapping("getReceiveAddressByMemberId")
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddress(Integer memberId) {
        List<UmsMemberReceiveAddress> receiveAddressList = this.umsMemberReceiveAddressService.getReceiveAddressByMemberId(memberId);
        return receiveAddressList;
    }
}
