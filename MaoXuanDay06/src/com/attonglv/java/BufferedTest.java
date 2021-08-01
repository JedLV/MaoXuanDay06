package com.attonglv.java;

import org.junit.Test;

import java.io.*;

public class BufferedTest {

    @Test
    public void BufferedStream(){

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcfile = new File("123.jpeg");
            File destfile = new File("654.jpeg");

            FileInputStream fis = new FileInputStream(srcfile);
            FileOutputStream fos = new FileOutputStream(destfile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] butter = new byte[1024];
            int len;
            while ((len = bis.read(butter)) != -1) {
                bos.write(butter, 0, len);
         }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    @Test
    public void testButteredReaderButteredWriter(){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(new File("hello.txt")));
            bw = new BufferedWriter(new FileWriter(new File("haha.txt")));

            char[] cbuf = new char[1024];
            int len;
            while((len = br.read(cbuf)) != -1){
                bw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }










}

