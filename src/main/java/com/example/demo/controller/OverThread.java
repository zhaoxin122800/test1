package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class OverThread {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final List<Integer> arrayList1 = Arrays.asList(1,2,3);
        final List<Integer> arrayList2 = Arrays.asList(4,5,6);

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (arrayList1){
                    for(Integer i: arrayList1){
                        System.out.println(i);
                    }
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    synchronized (arrayList2){
                        for (Integer o:arrayList2){
                            System.out.println(o);
                        }
                    }
                }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (arrayList2){
                    for(Integer i:arrayList2){
                        System.out.println(i);
                    }
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    synchronized (arrayList1){
                        for(Integer o:arrayList1){
                            System.out.println(o);
                        }
                    }
                }
            }
        }).start();

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable myCallable = new Callable() {
            @Override
            public String call() throws Exception {
                Thread.sleep(3000);
                System.out.println("calld方法执行了");
                 return "call方法返回值";
            }
        };
    System.out.println("提交任务之前 "+getStringDate());
    Future future = executor.submit(myCallable);
    System.out.println("提交任务之后，获取结果之前 "+getStringDate());
    System.out.println("获取返回值: "+future.get());
    System.out.println("获取到结果之后 "+getStringDate());
    }
    public static String getStringDate() {
    Date currentTime = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
    String dateString = formatter.format(currentTime);
    return dateString;
}



}
