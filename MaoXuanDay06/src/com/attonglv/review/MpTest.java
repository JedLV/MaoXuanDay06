package com.attonglv.review;

import org.junit.Test;

public class MpTest {
    @Test
    public void test(){
        int[] arr = new int[]{32,-58,56,0,-7,65,36};
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    @Test
    public void test2(){
        boolean x = true;
        boolean y = false;
        short z = 40;
        if ((z++ == 40) && (y = true)) {
            z++;
        }
        if ((x = false) || (++z == 43)) {
            z++;
        }
        System.out.println("z = " + z);
}


   @Test
    public void test3(){
       int num1 = 10,num2 = 21,num3 = -21;

       int max;
       if(num1 >= num2 && num1 >= num3){
           max = num1;
       }else if(num2 >= num1 && num2 >= num3){
           max = num2;
       }else{
           max = num3;
       }

       System.out.println("三个数中的最大值为：" + max);
   }


   @Test
    public void test4(){
       double d1 = 12.3;
       double d2 = 32.1;
       if(d1 > 10.0 && d2 < 20.0){
           System.out.println(d1 + d2);
       }else{
           System.out.println(d1 * d2);
       }
   }


   @Test
    public void test5(){
       String s1 = "北京";
       String s2 = "南京";

       String temp = s1;
       s1 = s2;
       s2 = temp;
       System.out.println(s1);
       System.out.println(s2);
   }


   @Test
    public void test6() {
       int a = 3;
       int x = 100;
       switch (a) {
           case 1:
               x += 5;
               break;
           case 2:
               x += 10;
               break;
           case 3:
               x += 16;
               break;
           default:
               x += 34;
       }
   }


   @Test
    public void test7(){
       int sum = 0;
       for(int i = 1;i <= 100;i++){
           if(i % 2 != 0){
               System.out.println(i);
               sum += i;
           }
       }
       System.out.println(sum);
   }


   @Test
    public void test8(){
       for(int i = 1;i <= 1000;i++){
           int factor = 0;
           for(int j = 1;j <= i/2;j++){

               if(i % j == 0){
                   factor += j;
               }
           }
           if(i == factor){
               System.out.println(i);
           }
       }
   }


   @Test
    public void test9(){
       for (int i = 0; i <= 6; i++) {
           for (int j = 0; j <7 - i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }


   @Test
    public void testA(){
       int[][] arr = new int[][]{{1,2,3},{4,5},{6,7,8}};

       for(int i = 0;i < arr.length;i++){
           for(int j = 0;j < arr[i].length;j++){
               System.out.print(arr[i][j] + "\t");
           }
           System.out.println();
       }
   }


   @Test
    public void testB(){
        int [] arr = new int[]{0,2,12,22,32,42,52,62};
       boolean isFlag = true;
//        int dest = 22;
        int dest = 2;
       for (int i = 0; i < arr.length; i++) {
           if (dest == arr[i]){
               isFlag = false;
               System.out.println(i);
               break;
           }
           else if (isFlag){
               System.out.println("线性查找--未找到！");
           }
       }
   }


   @Test
    public void testC(){
        Circle c = new Circle();
        c.radius = 2;
       System.out.println(c.findArea());
   }
class Circle{
        private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return Math.PI*radius*radius;
    }
}





}



