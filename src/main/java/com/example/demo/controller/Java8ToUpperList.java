package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8ToUpperList {
    public static void main(String[] args) {
        List<String> alpha = Arrays.asList("a", "b", "c", "d");

        List<String> alphaUpper = new ArrayList<>();
         int[]nume = {2,7,11,12};


        for (String s : alpha) {

            alphaUpper.add(s.toUpperCase());


        }



        System.out.println(alpha); //[a, b, c, d]

        System.out.println(alphaUpper); //[A, B, C, D]



        // Java 8

        List<String> collect = alpha.stream()
                               .map(String::toUpperCase)
                               .collect(Collectors.toList());

        System.out.println(collect); //[A, B, C, D]
    }
}
