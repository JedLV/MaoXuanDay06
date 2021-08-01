package com.attonglv.java;

import org.junit.Test;

import java.util.*;

public class GenericTest {

    @Test
    public void test(){
        ArrayList list = new ArrayList();

        list.add(99);
        list.add(88);
        list.add(66);
        list.add(77);
        list.add(100);

        list.add("TOM");

        for (Object sore : list) {

            int stuSore = (Integer) sore;
            System.out.println(stuSore);
        }
    }

    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(99);
        list.add(88);
        list.add(66);
        list.add(77);
        list.add(100);

        for (Integer sore : list) {
            int stuSore = sore;
            System.out.println(stuSore);
        }
    }

    @Test
    public void test3(){
        Map<String,Integer> map = new HashMap<String,Integer>();

        map.put("TOM",88);
        map.put("Jerry",99);
        map.put("Marry",78);

        Set<Map.Entry<String,Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = entry.iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry1 = iterator.next();
            String key = entry1.getKey();
            Integer value = entry1.getValue();
            System.out.println(key + "-----" + value);
        }
    }

//577

}
