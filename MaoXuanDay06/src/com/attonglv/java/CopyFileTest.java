package com.attonglv.java;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileTest {


    public void copyFile(String srcPath, String destPath) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File srcfile = new File(srcPath);
            File destfile = new File(destPath);

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
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    @Test
    public void testCopyFile(){

        long start = System.currentTimeMillis();

        String srcPath = "C:\\Users\\ThinkPad\\Desktop\\456.avi";
        String destPath = "C:\\Users\\ThinkPad\\Desktop\\123.avi";

        copyFile(srcPath,destPath);

        long end = System.currentTimeMillis();

        System.out.println("复制操作花费的时间为："+ (end - start));
    }

}
