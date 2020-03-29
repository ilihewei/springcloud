package com.test.cn.controller;

import com.test.cn.entity.CommentResult;
import com.test.cn.entity.Payment;
import com.test.cn.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommentResult create( Payment payment){
        int i = paymentService.create(payment);
        if(i>0){
            return new CommentResult(200,"success");
        }else{
            return  new CommentResult(500,"fail");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommentResult getPayment(@PathVariable("id") int id){
        Payment payment = paymentService.getPaymentById(id);
        return new CommentResult(200,"success",payment);
    }


}
