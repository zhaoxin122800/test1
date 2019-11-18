package com.example.demo.controller;

public class ricket extends Thread {

    int ticket = 100;
    Object lock= new Object();

    public void run(){
        while (true){
             synchronized (lock){
                 if (ticket>0) {
                     try {
                         Thread.sleep(100);
                     }catch (Exception e){
                         e.printStackTrace();
                     }finally {
                         System.out.println("执行"+ticket);
                     }
                     System.out.println(Thread.currentThread().getName()+"正在买票"+ticket--);
                 }
             }

        }

    }
}
