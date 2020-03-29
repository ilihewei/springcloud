package com.test.cn.controller;

import com.test.cn.entity.CommentResult;
import com.test.cn.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    private static  String url="http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "order/get/{id}")
    public CommentResult<Payment> get(@PathVariable("id") Integer id){
       return restTemplate.getForObject(url+"/payment/get/"+id, CommentResult.class);
    }
    @PostMapping(value = "order/create")
    public CommentResult<Payment> create(Payment payment){
        return  restTemplate.patchForObject(url+"/payment/create",payment, CommentResult.class);
    }
}
