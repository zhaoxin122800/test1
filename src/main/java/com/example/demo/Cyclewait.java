package com.example.demo;

public class Cyclewait implements Runnable {
    private static String value;


    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        value ="测试主线程等待";
    }


    public static void main(String[] args) throws InterruptedException {
        Cyclewait cw= new Cyclewait();
        Thread t1= new Thread(cw);
        t1.start();
//        while (cw.value ==null){
//            Thread.currentThread().sleep(100);
//        }
//        t1.join();
        System.out.println("value=" + value);
    }
}
