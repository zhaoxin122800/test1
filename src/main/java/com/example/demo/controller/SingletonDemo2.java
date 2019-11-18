package com.example.demo.controller;

public class SingletonDemo2 {

    public static SingletonDemo2 instance;

    private SingletonDemo2(){}

    public SingletonDemo2 singletonDemo2(){

        if(instance == null){
            instance = new SingletonDemo2();

        }
        return instance;
    }
}
