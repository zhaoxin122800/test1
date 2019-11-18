package com.example.demo;

import java.util.*;

public class ListAndSet {

    public static void main(String[] args) {
            Set<String> s= new TreeSet<>();
            List<String> li= new ArrayList<String>();
            Map<String,Integer> map =new HashMap<>();
            s.add("a");
            s.add("b");
            s.add("d");
            s.add("e");
            s.add("f");
            s.add("c");
            s.add("1");
            s.add("3");
            s.add("5");
            s.add("2");
            System.out.println(s);

//        Random random = new Random();
//        List<Integer> li= new ArrayList<>();
//        for(int i=0;i <=100;i++){
//            int i1 = random.nextInt(100);
//            li.add(i1);
//        }
//        System.out.println(li);
//        Collections.sort(li);
//        System.out.println(li);

//        new Thread(new Runnable() {
//            int ticker =100;
//            Object lock= new Object();
//            @Override
//            public void run() {
//                while (true){
//                    synchronized (lock){
//                    if(ticker>=0){
//                        try {
//                            Thread.sleep(100);
//                        }catch (Exception e){
//                            e.printStackTrace();
//                        }
//                        System.out.println(ticker--);
//                    }
//                }
//                }
//            }
//        }).start();

        }
    }

