package com.example.demo.controller;

import java.util.concurrent.Callable;

public class Mycallable implements Callable {
    @Override
    public Object call() throws Exception {
        String vale ="test";

        System.out.println("read to work ");

        Thread.sleep(5000);
        System.out.println("task down");
        return vale;
    }
}
