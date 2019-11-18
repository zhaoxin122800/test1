package com.example.demo.controller;

import java.util.Date;

public class drink extends Thread {

    public void run(){
        System.out.println("开始喝酒"+new Date());

        try {
               Thread.sleep(5000);
        }catch (Exception e){
                e.printStackTrace();
        }
        System.out.println("喝酒结束"+new  Date());

    }
}
