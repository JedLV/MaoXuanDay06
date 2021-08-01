package com.attonglv.java;

import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class OtherStreamTest {

    @Test
    public void test(){
        BufferedReader br = null;
        try {
            InputStreamReader isr  = new InputStreamReader(System.in);
            br = new BufferedReader(isr);

            while (true){
                System.out.println("请输入字符串：");
                String data = br.readLine();
                if ("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)){
                    System.out.println("程序结束");
                    break;
                }
                String upperCase = data.toUpperCase();
                System.out.println(upperCase);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    @Test
    public void test2(){
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream("psychic.txt"));

            dos.writeUTF("张小凡");
            dos.flush();
            dos.writeInt(23);
            dos.flush();
            dos.writeBoolean(true);
            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (dos != null){
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Test
    public void test3() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("psychic.txt"));

        String name  = dis.readUTF();
        int age = dis.readInt();
        boolean isMale = dis.readBoolean();

        System.out.println("name ="+ name);
        System.out.println("age ="+ age);
        System.out.println("isMale ="+ isMale);

        dis.close();
    }


    @Test
    public void testObjectOutputStream(){
        ObjectOutputStream oos = null;
        try {
           oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
           oos.writeObject(new String("我爱你吗"));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oos!= null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void testObjectInputStream(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.dat"));

            Object obj = ois.readObject();
            String s = (String) obj;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    @Test
    public void testRandomAccessFile(){
        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try {
            raf1 = new RandomAccessFile(new File("写真.jpg"),"r");
            raf2 = new RandomAccessFile(new File("写真2.jpg"),"rw");

            byte[] buffer = new byte[1024];
            int len;
            while ((len = raf1.read(buffer)) != -1){
                raf2.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (raf1 != null){
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (raf2 != null){
                try {
                    raf2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Test
    public void test123() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile(new File("object.bat"), "rw");


        raf1.seek(raf1.length());
        raf1.write("天呐!我真帅".getBytes(StandardCharsets.UTF_8));
        raf1.close();
    }

    @Test
    public void test1234() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile(new File("object.bat"), "rw");

        raf1.seek(3);
        StringBuilder builder = new StringBuilder((int) new File("object.bat").length());
        byte[] buffer = new byte[20];
        int len;
        while ((len = raf1.read(buffer)) != -1){
            builder.append(new String(buffer,0,len));
        }

        raf1.seek(3);
        raf1.write("天呐!我真帅".getBytes(StandardCharsets.UTF_8));

        raf1.write(builder.toString().getBytes(StandardCharsets.UTF_8));
        raf1.close();
    }






}
