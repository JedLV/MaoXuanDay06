package com.attonglv.java;

import org.junit.Test;

import java.io.*;

public class InputOutputStreamReaderWriter {

    @Test
    public void InputStreamReader(){
        InputStreamReader isr = null;
        try {
            FileInputStream fis = new FileInputStream("psychic.txt");
            isr = new InputStreamReader(fis,"UTF-8");

            char[] club = new char[20];
            int len;
            while ((len = isr.read(club)) != -1){
                String s = new String(club,0,len);
                System.out.print(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (isr != null){
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    //OutputStreamWriter和InputStreamReader的综合使用
    @Test
    public void testIO(){
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            File file1 = new File("psychic.txt");
            File file2 = new File("psychic_gbk.txt");

            FileInputStream fis = new FileInputStream(file1);
            FileOutputStream fos = new FileOutputStream(file2);

            isr = new InputStreamReader(fis,"utf-8");
            osw = new OutputStreamWriter(fos,"gbk");

            char[] club = new char[20];
            int len;
            while ((len= isr.read(club)) !=-1){
                osw.write(club,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (osw != null){
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (isr != null){
                    try {
                        isr.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }




















}
