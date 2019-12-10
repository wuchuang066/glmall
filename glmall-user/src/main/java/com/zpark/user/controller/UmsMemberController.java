package com.zpark.user.controller;

import com.zpark.user.service.UmsMemberReceiveAddressService;
import com.zpark.user.entity.UmsMember;
import com.zpark.user.entity.UmsMemberReceiveAddress;
import com.zpark.user.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wuc
 * @date 2019/11/17 22:15
 */
@RestController
public class UmsMemberController {
    @Autowired
    private UmsMemberService memberService;

    @RequestMapping("queryAllUser")
    public List<UmsMember> queryAllUser() {
        return this.memberService.quertAllUser();
    }



}
