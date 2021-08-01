package com.attonglv.java;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {

    @Test
    public void test2(){
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof  Employee){
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;

                    MyDate b1 = e1.getBirthday();
                    MyDate b2 = e2.getBirthday();

                    int minusYear = b1.getYear() - b2.getYear();
                    if (minusYear != 0){
                        return minusYear;
                    }

                    int minusMonth = b1.getMonth() - b2.getMonth();
                    if (minusMonth != 0){
                        return minusMonth;
                    }

                    int minusDay = b1.getDay() - b2.getDay();
                   
                }
                return 0;
//                return new RuntimeException("传入的数据类型不一致！");
            }
        });

        Employee e1 = new Employee("陈独秀",40,new MyDate(1879,5,4));
        Employee e2 = new Employee("李大钊",30,new MyDate(1889,5,5));
        Employee e3 = new Employee("钱玄同",32,new MyDate(1887,5,6));
        Employee e4 = new Employee("刘半农",28,new MyDate(1891,5,7));
        Employee e5 = new Employee("周树人",38,new MyDate(1881,5,8));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    @Test
    public void test(){
        TreeSet set = new TreeSet();

        Employee e1 = new Employee("陈独秀",40,new MyDate(1879,5,4));
        Employee e2 = new Employee("李大钊",30,new MyDate(1889,5,4));
        Employee e3 = new Employee("钱玄同",32,new MyDate(1887,5,4));
        Employee e4 = new Employee("刘半农",28,new MyDate(1891,5,4));
        Employee e5 = new Employee("周树人",38,new MyDate(1881,5,4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
