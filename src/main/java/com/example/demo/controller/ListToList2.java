package com.example.demo.controller;

import com.example.demo.dao.Staff;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToList2 {

    public static void main(String[] args) {
                // Extra, streams apply to any data type.

        List<Integer> num = Arrays.asList(1,2,3,4,5);

        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());

        System.out.println(collect1); //[2, 4, 6, 8, 10]


        List<Staff> staff = Arrays.asList(

                new Staff("mkyong", 30, new BigDecimal(10000)),

                new Staff("jack", 27, new BigDecimal(20000)),

                new Staff("lawrence", 33, new BigDecimal(30000))

        );



        //Before Java 8

        List<String> result = new ArrayList<>();

        for (Staff x : staff) {

            result.add(x.getName());

        }

        System.out.println(result); //[mkyong, jack, lawrence]



        //Java 8

        List<String> collect = staff.stream().map(x -> x.getName()).collect(Collectors.toList());
        List<String> collect2 = staff.stream().map(x -> x.getName()).collect(Collectors.toList());

        System.out.println(collect); //[mkyong, jack, lawrence]
    }

    }

