package com.example.demo.controller;

import com.example.demo.dao.Staff;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.security.krb5.internal.Ticket;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public class test {

    public static void main(String[] args) {
        ricket ricket = new ricket();

        Thread t1 = new Thread(ricket, "窗口1");
        Thread t2 = new Thread(ricket, "窗口1");
        Thread t3 = new Thread(ricket, "窗口1");

        t1.start();
        t2.start();
        t3.start();

//        drink dT= new drink();
//        eat eT= new eat();
//
//        dT.start();
//        eT.start();

    }



}
