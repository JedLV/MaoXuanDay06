package com.attonglv.java;

import org.junit.Test;

import java.io.*;

public class FileInputOutputStreamTest {

    @Test
    public void testFileInputStream(){
        FileInputStream fi = null;
        try {
            File file = new File("hello.txt");

            fi = new FileInputStream(file);

            byte[] buffer = new byte[5];
            int len;
            while ((len = fi.read(buffer)) != -1){
                String str = new String(buffer,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fi != null)
                fi.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }



    @Test
    public void testFileInputOutputStream(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File srcfile = new File("123456.jpg");
            File destfile = new File("654321.jpg");

            fis = new FileInputStream(srcfile);
            fos = new FileOutputStream(destfile);

            byte[] butter = new byte[1024];
            int len;
            while ((len = fis.read(butter)) != -1){
                fos.write(butter,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fis != null)
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null)
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
