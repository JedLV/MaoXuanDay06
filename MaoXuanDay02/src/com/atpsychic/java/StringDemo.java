package com.atpsychic.java;

import org.junit.Test;

public class StringDemo {

    public String reverse(String str, int starIndex, int endIndex){

        if (str != null && str.length() != 0){
            char[] arr = str.toCharArray();
            for (int x = starIndex, y = endIndex; x < y; x++,y--){
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
        return null;
    }

    //方式二
    public String reverse1(String str, int starIndex, int endIndex){

        if (str != null){
            String reveseStr = str.substring(0,starIndex);
            for (int i = endIndex; i >= starIndex ; i--) {
                reveseStr += str.charAt(i);
            }
            reveseStr += str.substring(endIndex +1);
            return reveseStr;
        }
        return null;
    }

    //方式三
    public String reverse2(String str, int starIndex, int endIndex){

        if (str != null){
            StringBuilder builder = new StringBuilder(str.length());
            builder.append(str.substring(0,starIndex));
            for (int i = endIndex; i >= starIndex ; i--) {
                builder.append(str.charAt(i));
            }
            builder.append(str.substring(endIndex +1));
            return builder.toString();
        }
        return null;
    }


    @Test
    public void test1(){
        String str = "abcdefg";
        String reverse = reverse(str,2,5);
        System.out.println(reverse);
    }

    @Test
    public void testReverse(){
        String str = "abcdefg";
        String reverse = reverse(str,2,5);
        System.out.println(reverse);
    }

    @Test
    public void testReverse2(){
        String str = "abcdefg";
        String reverse = reverse(str,2,5);
        System.out.println(reverse);
    }
}

