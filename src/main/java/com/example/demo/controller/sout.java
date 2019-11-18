package com.example.demo.controller;

public class sout {
    public static void main(String[] args) {
        System.out.println(2.0-1.1);
        System.out.println(1.0-0.1);


        String str1='a'+3+"hello";
        String str2="hello"+'a'+3;

        System.out.println(str1);
        System.out.println(str2);

        int val=0;
        for (int a=1; a<100;a++){
            val=val++;
        }
        System.out.println(val);


        short j=1;
        j+=1;
    }
}
