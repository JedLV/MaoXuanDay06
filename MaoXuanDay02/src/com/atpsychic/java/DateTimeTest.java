package com.atpsychic.java;

import org.junit.Test;

import java.util.Date;

public class DateTimeTest {

    @Test
    public void test(){

        long time = System.currentTimeMillis();
        System.out.println(time);
    }

    @Test
    public void test2(){
        Date date = new Date();
        System.out.println(date.toString());

        System.out.println(date.getTime());


        Date date2 = new Date(1627350288233L);
        System.out.println(date2.toString());

        java.sql.Date date3 = new java.sql.Date(1627350288233L);
        System.out.println(date3.toString());
    }
}
