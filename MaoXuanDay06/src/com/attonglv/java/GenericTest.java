package com.attonglv.java;

import org.junit.Test;

import java.util.*;
import java.util.Map.*;

public class GenericTest {

    //在集合中使用泛型：以ArrayList为例
    @Test
    public void test(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(150);
        list.add(140);
        list.add(130);
        list.add(120);
//方式一：
//        for (Integer score : list) {
//            int stuScore = score;
//            System.out.println(stuScore);
//        }
//方式二：
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int stuScore = iterator.next();
            System.out.println(stuScore);
        }
    }


    //在集合中使用泛型：以HashMap为例
    @Test
    public void test2(){
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("竺可颖",18);
        map.put("盛绾绾",19);
        map.put("卓  奈",25);

        Set<Map.Entry<String,Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = entry.iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Integer> e = iterator.next();
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key + "  年龄：" + value);
        }
    }
}
