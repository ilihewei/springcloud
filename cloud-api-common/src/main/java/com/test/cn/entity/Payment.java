package com.test.cn.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Payment implements Serializable {
    private int id;
    private  double serial;

}
