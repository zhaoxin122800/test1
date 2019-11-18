package com.example.demo.controller;

import java.util.Date;

public class eat extends Thread {

    public void run(){
        System.out.println("开始吃饭"+new Date());
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("吃饭结束"+new  Date());


    }
}
