package com.atpsychic.java;

import org.junit.Test;

public class StringButterTest {

    @Test
    public void test(){

        long startTime = 0L;
        long endTime = 0L;
        String test = "";
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");


        startTime = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            buffer.append(String.valueOf(i));
        }

        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间：" + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            builder.append(String.valueOf(i));
        }

        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间：" + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            test = test + i;
        }

        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间：" + (endTime - startTime));

    }
}
