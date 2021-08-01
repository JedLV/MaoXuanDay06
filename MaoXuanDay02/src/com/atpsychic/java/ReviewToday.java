import com.atpsychic.java.Goods;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class ReviewToday {

    @Test
    public void test1() {
        long time = System.currentTimeMillis();
        System.out.println(time);
    }

    @Test
    public void test2(){
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());

        Date date1 = new Date(155030620410L);
        System.out.println(date1.toString());

        java.sql.Date date2 = new java.sql.Date(1550306204104L);
        System.out.println(date2);

        Date date3 = new Date();
        java.sql.Date date4 = new java.sql.Date(date3.getTime());
    }


    @Test
    public void test3(){
        String[] arr = new String[]{"AA","CC","MM","GG"};
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String){
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("输入的数据类型不一致！");
            }
        });
        System.out.println(Arrays.toString(arr));
    }


    @Test
    public void test4(){
        Goods[] arr = new Goods[5];
        arr[0] = new Goods("蒋婷",19);
        arr[1] = new Goods("苏浅浅",19);
        arr[2] = new Goods("乔琳琳",19);
        arr[3] = new Goods("章楠楠",19);
        arr[4] = new Goods("柳月茹",22);

        Arrays.sort(arr, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Goods && o2 instanceof Goods){
                    Goods g1 = (Goods) o1;
                    Goods g2 = (Goods) o2;
                    if (g1.getName().equals(g2.getName())) {
                        return -Double.compare(g1.getPrice(), g2.getPrice());
                    } else {
                        return g1.getName().compareTo(g2.getName());
                    }
                }
                throw new RuntimeException("输入的数据类型不一致！");
            }
        });
            System.out.println(Arrays.toString(arr));
    }



















}
