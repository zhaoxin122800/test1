package com.example.demo.controller;

public class threadDemo {

    public static void main(String[] args) {

        final Object lock =new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread A is waiting to get lock");
                synchronized (lock){

                    try {
                        System.out.println("thread A  get  lock");
                        System.out.println("Thread A is sleeping 20 ms");
                        Thread.sleep(20);
                        lock.wait();
                        System.out.println("thread A is down");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread B is waiting to get lock");
                    synchronized (lock){
                        System.out.println();
                        try {
                            System.out.println("thread B  get  lock ");
                            System.out.println("Thread B is sleeping 10 ms");
                            Thread.sleep(10);
                            System.out.println("thread b is down");
                            lock.notify();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

            }
        }).start();

    }
}
