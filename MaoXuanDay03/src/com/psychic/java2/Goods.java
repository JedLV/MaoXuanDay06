package com.psychic.java2;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Goods implements  Comparable{

    private String name;
    private double price;

    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
            Goods goods = (Goods)o;
            if(this.price > goods.price){
                return 1;
            }else if(this.price < goods.price){
                return -1;
            }else{
                return -this.name.compareTo(goods.name);
            }
        }
        throw new RuntimeException("传入的数据类型不一致！");
    }


@Test

    public void testBigInteger(){
        BigInteger bi = new BigInteger("1465165121563");
        BigDecimal bd = new BigDecimal("1465.1653");
        BigDecimal bd2 = new BigDecimal("63");

        System.out.println(bi);

        System.out.println(bd.divide(bd2,BigDecimal.ROUND_HALF_UP));
        System.out.println(bd.divide(bd2,15,BigDecimal.ROUND_HALF_UP));
    }
}


