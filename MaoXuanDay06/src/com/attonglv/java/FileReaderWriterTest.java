package com.attonglv.java;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterTest {

    @Test
    public void testFileReader()  {


        FileReader reader = null;
        try {
            File file = new File("hi.txt");
            reader = new FileReader(file);

            //读取文件中的内容
            int data =reader.read();
            while (data != -1) {//read()：返回读入的一个字符。如果达到文件末尾，返回-1
                System.out.print((char) data);
                data = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader != null)
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



    @Test
    public void testFileWriter()  {
        FileWriter fw = null;
        try {
            File file = new File("hi.txt");

            fw = new FileWriter(file);

            //从内存中写出数据到硬盘的文件里
            fw.write("I love you baby!");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fw != null)
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void testFileReaderFileWriter(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File srcfile = new File("hi.txt");
            File destfile = new File("hello.txt");

            fr = new FileReader(srcfile);
            fw = new FileWriter(destfile);

            char[] read = new char[5];
            int len;
            while ((len = fr.read(read)) != -1){
                fw.write(read,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
