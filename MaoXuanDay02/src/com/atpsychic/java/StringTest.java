package com.atpsychic.java;

import org.junit.Test;

public class StringTest {
    @Test
    public void test1(){
        String s1 = "abc";
        String s2 = "abc";
//        s1 = "HELLO";

        System.out.println(s1 == s2);

        System.out.println(s1);
        System.out.println(s2);
    }


        @Test
        public void test2(){
            String s1 = "JavaEE";
            String s2 = "JavaEE";

            String s3 = new String("JavaEE");
            String s4 = new String("JavaEE");

            System.out.println(s1 == s2); 
            System.out.println(s1 == s3);
            System.out.println(s1 == s4);
            System.out.println(s3 == s4);

        }
}
