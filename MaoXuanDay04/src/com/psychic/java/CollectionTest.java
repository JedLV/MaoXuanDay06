package com.psychic.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

    @Test
    public void test(){

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.contains(new Person("Jerry",20));
        coll.add(new String("TOM"));
        coll.add(false);

        for (Object obj : coll){
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5,6};
        for (int i : arr){
            System.out.println(i);
        }
    }

    @Test
    public void test3(){
        String[] arr = new String[]{"我的择偶标准：","漂亮","温柔","独立"};
        for (String s : arr){
            s = "我的择偶标准：孤儿";
        }

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = "我的择偶标准：孤儿";
//        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }







}
