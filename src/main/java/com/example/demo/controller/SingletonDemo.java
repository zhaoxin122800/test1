package com.example.demo.controller;

public class SingletonDemo {

    private static SingletonDemo instance = new SingletonDemo();

    private SingletonDemo(){};

    public SingletonDemo getInstance(){
            return instance;
    }

}
