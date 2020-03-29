package com.test.cn.serviceImpl;

import com.test.cn.entity.Payment;
import com.test.cn.mapper.PaymentMapper;
import com.test.cn.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {


    @Autowired
    private PaymentMapper paymentMapper;


    @Override
    public int create(Payment payment) {
        int i=0;
        try{
            i=paymentMapper.create(payment);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  i;
    }

    @Override
    public Payment getPaymentById(Integer id) {
        return paymentMapper.getPaymentById(id);
    }


}
