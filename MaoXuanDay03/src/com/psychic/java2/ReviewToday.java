package com.psychic.java2;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

public class ReviewToday {
    @Test
    public void test() throws ParseException {
        String birth = "2020-09-08";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = sdf1.parse(birth);
//        System.out.println(date);

//        java.sql.Date birthDate = new java.sql.Date(date.getTime());
//        System.out.println(birthDate);
    }


        @Test
       public void test1(){

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
            String s1 = formatter.format(LocalDateTime.now());
            System.out.println(s1);

            TemporalAccessor accessor = formatter.parse("2020-10-21 08:00:00");
            System.out.println(accessor);
        }

        @Test
    public void test2(){
            Set<String> zoneIds = ZoneId.getAvailableZoneIds();
            for (String s : zoneIds){
                System.out.println(s);
            }
            System.out.println();

            LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
            System.out.println(localDateTime);
        }

        @Test
    public void test3(){
            ZonedDateTime zonedDateTime = ZonedDateTime.now();
            System.out.println(zonedDateTime);

            ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
            System.out.println(zonedDateTime1);
        }

       @Test
    public void test4() {
           LocalTime localTime = LocalTime.now();
           LocalTime localTime1 = LocalTime.of(15,23,32);
           Duration duration = Duration.between(localTime1,localTime);
           System.out.println(duration);

           System.out.println(duration.getSeconds());
           System.out.println(duration.getNano());

           LocalDateTime localDateTime = LocalDateTime.of(2016, 6, 12, 15, 23, 32);
           LocalDateTime localDateTime1 = LocalDateTime.of(2017, 6, 12, 15, 23, 32);

           Duration duration1 = Duration.between(localDateTime1, localDateTime);
           System.out.println(duration1.toDays());
       }

    @Test
    public void test5(){
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2026, 7, 20);

        Period period = Period.between(localDate, localDate1);
        System.out.println(period);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
//
        Period period1 = period.withYears(2);
        System.out.println(period1);
    }

    @Test
    public void test6(){
        TemporalAdjuster temporalAdjuster = TemporalAdjusters.next(DayOfWeek.SUNDAY);

        LocalDateTime localDateTime = LocalDateTime.now().with(temporalAdjuster);
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.now().with(new TemporalAdjuster(){

            @Override
            public Temporal adjustInto(Temporal temporal) {
                LocalDate date = (LocalDate)temporal;
                if(date.getDayOfWeek().equals(DayOfWeek.FRIDAY)){
                    return date.plusDays(3);
                }else if(date.getDayOfWeek().equals(DayOfWeek.SATURDAY)){
                    return date.plusDays(2);
                }else{
                    return date.plusDays(1);
                }

            }

        });

        System.out.println("下一个工作日是：" + localDate);
    }



}

