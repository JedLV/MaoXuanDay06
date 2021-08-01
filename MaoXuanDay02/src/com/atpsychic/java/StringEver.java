package com.atpsychic.java;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringEver {
//    public static void main(String[] args) {
//        String s1 = "abc";
//        String s2 = "abc";
//        System.out.println(s1 == s2);
//
//        String s3 = "abc";
//        s3 += "def";
//        System.out.println(s3);
//
//        String  s4 = "abc";
//        String s5 = s4.replace('a','m');
//        System.out.println(s5);
//

//        String s1 = "javaEE";
//        String s2 = "javaEE";
//
//        String s3 = new String("javaEE");
//        String s4 = new String("javaEE");
//
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s1 == s4);
//        System.out.println(s3 == s4);
//
//        String s1 = "javaEE";
//        String s2 = "hadoop";
//
//        String s3 = "javaEEhadoop";
//        String s4 = "javaEE"+"hadoop";
//        String s5 = s1+"hadoop";
//        String s6 = "javaEE"+s2;
//        String s7 =s1+s2;
//
//        System.out.println(s3 == s4);
//        System.out.println(s3 == s5);
//        System.out.println(s3 == s6);
//        System.out.println(s3 == s7);
//        System.out.println(s5 == s6);
//        System.out.println(s5 == s7);
//        System.out.println(s6 == s7);
//
//        String s8 = s6.intern();
//        System.out.println(s8);
//        System.out.println(s3 == s8);
//
//    }
//    @Test
//    public void test(){
//        String s1 = "123";
//        int num = Integer.parseInt(s1);
//
//        String s2 = String.valueOf(num);
//        String s3 = num + "";
//        System.out.println(s1 == s3);
//        System.out.println(s1 == s2);
//    }

//    @Test
//    public void test(){
//        String s1 = "abc123";
//
//        char[] charArray = s1.toCharArray();
//        for (int i = 0; i < charArray.length; i++) {
//            System.out.println(charArray[i]);
//        }
//
//        char[] arr = new char[]{'h','e','l','l','o'};
//        String s2 = new String(arr);
//        System.out.println(s2);
//    }

//    @Test
//    public void test() throws UnsupportedEncodingException {
//        String s1 = "abc123中国";
//        byte[] bytes = s1.getBytes(StandardCharsets.UTF_8);
//        System.out.println(Arrays.toString(bytes));
//
//        byte[] gbks = s1.getBytes("gbk");
//        System.out.println(Arrays.toString(gbks));
//
//        String s2 = new String(bytes);
//        System.out.println(s2);
//
//        String s3 = new String(gbks);
//        System.out.println(s3);
//
//        String s4 = new String(gbks,"gbk");
//        System.out.println(s4);
//    }

    @Test
    public void test(){
        String s = new String();
        String s1 = new String("abc");

        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.length());
        sb1.append('a');
        sb1.append('b');

        StringBuffer sb2 = new StringBuffer("abc");
    }






}
