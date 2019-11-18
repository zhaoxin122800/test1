package com.example.demo.controller;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("熊大", "棕色");
        map.put("熊二", "黄色");

        for(Map.Entry<String,String> entry : map.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+value+"这是第一条");
        }

        for(String key :map.keySet()){
            System.out.println(key+"这是第二条KEY");
        }
        for(String value : map.values()){

            System.out.println(value+"这是第二条value");
        }

        Iterator <Map.Entry<String,String>> entries= map.entrySet().iterator();
        while (entries.hasNext()){
            Map.Entry<String,String> entry =entries.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+value+"这是第三条");
        }

        for(String key : map.keySet()){
            String value = map.get(key);
            System.out.println(key+value+"这是第四条");
        }



    }
}
