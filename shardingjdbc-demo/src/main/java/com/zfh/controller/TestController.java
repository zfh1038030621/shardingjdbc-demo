package com.zfh.controller;


import com.zfh.exam.UserInfo;
import com.zfh.exam.UserInfoExample;
import com.zfh.exam.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( value = "/test")
@ComponentScan({"config"})
public class TestController {

    @Autowired
    UserInfoMapper mapper;

    @RequestMapping( value = "insert")
    public  void  insert(){
        UserInfo record = new UserInfo();
        record.setUsername("zfh1");
        record.setSex("3");

        int result = mapper.insertSelective(record) ;

        System.out.println( result > 0 ? "插入成功" : "插入失败");
    }

    @RequestMapping( value = "detail")
    public  void  detail(){
        UserInfoExample record = new UserInfoExample();
        UserInfoExample.Criteria criteria = record.createCriteria();
        criteria.andIdEqualTo(10000L);
        List<UserInfo> a = mapper.selectByExample(record);

        System.out.println( a.get(0).getUsername());
    }
}
