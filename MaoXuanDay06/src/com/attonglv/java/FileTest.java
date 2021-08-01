package com.attonglv.java;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

    @Test
    public void test() {
        File file = new File("hello.txt");
        File file2 = new File("f:\\io\\hi.txt");

        System.out.println(file.getAbsolutePath());//获取绝对路径
        System.out.println(file.getPath());//获取路径
        System.out.println(file.getName());//获取名称
        System.out.println(file.getParent());//获取上层文件目录路径。若无，返回NULL
        System.out.println(file.length());//获取文件长度（即：字节数）。不能获取目录的长度
        System.out.println(new Date(file.lastModified()));//获取最后一次的修改时间，毫秒值

        System.out.println("----------------");

        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(new Date(file2.lastModified()));

    }

    @Test
    public void test2() {//获取指定目录下的所有文件 或者 文件目录的名称数组
        File file = new File("F:\\Multithreading");

        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("+++++++++++++++++");

        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }


    @Test
    public void test3() {//把文件 重命名 为 指定的文件路径
        File file = new File("hello.txt");
        File file2 = new File("F:\\io\\hi.txt");

        boolean renameTo = file2.renameTo(file);
        System.out.println(renameTo);
    }


    @Test
    public void test4() {
        File file = new File("hi.txt");

        System.out.println(file.isDirectory());//判断是否是文件目录
        System.out.println(file.isFile());//判断是否是文件
        System.out.println(file.exists());//判断是否存在
        System.out.println(file.canRead());//判断是否可读
        System.out.println(file.canWrite());//判断是否可写
        System.out.println(file.isHidden());//判断是否隐藏
    }


    @Test
    public void test5() throws IOException {
        File file = new File("hi.txt");
        if (!file.exists()){//创建文件。若文件存在，则不创建，返回false
            file.createNewFile();
            System.out.println("创建成功!");
        }else {
            file.delete();
            System.out.println("删除成功！");
        }

        //删除文件 或者 文件夹 <Java中的删除不走回收站>
    }


    @Test
    public void test6(){
        File file = new File("F:\\Multithreading\\io1\\io3");
        //创建文件目录。如果此文件目录存在，则不创建。如果此文件目录的上层目录不存在。也不创建
        boolean mkdir = file.mkdir();
        if (mkdir){
            System.out.println("1创建成功！");
        }

        File file2 = new File("F:\\Multithreading\\io2\\io4");
        //创建文件目录。如果上层文件目录不存在，一并创建
        boolean mkdir2 = file2.mkdirs();
        if (mkdir2){
            System.out.println("2创建成功！");
        }
    }
}
