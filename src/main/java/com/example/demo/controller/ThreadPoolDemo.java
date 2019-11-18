package com.example.demo.controller;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo {

    public static void main(String[] args) throws ExecutionException {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        Future<String> future = newCachedThreadPool.submit(new Mycallable());
        if(!future.isDone()){
            System.out.println("task has not finished ,please wait ");
        }
        try {
            System.out.println("task  return ="+ future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            newCachedThreadPool.shutdown();
        }
    }
}
