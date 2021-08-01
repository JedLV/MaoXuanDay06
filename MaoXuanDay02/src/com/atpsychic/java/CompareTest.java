package com.atpsychic.java;

import org.junit.Test;

import java.util.Arrays;

public class CompareTest {

    @Test
    public void test(){
        String[] arr = new String[]{"雨馨","梦可儿","澹台璇","龙舞","南宫仙儿"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2(){
        Goods[] arr = new Goods[5];
        arr[0] = new Goods("蒋婷",19);
        arr[1] = new Goods("苏浅浅",19);
        arr[2] = new Goods("乔琳琳",19);
        arr[3] = new Goods("章楠楠",19);
        arr[4] = new Goods("柳月茹",22);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
