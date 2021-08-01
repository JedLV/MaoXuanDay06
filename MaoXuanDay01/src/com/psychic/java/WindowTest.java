package com.psychic.java;

class Window implements Runnable{
    private  int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticket > 0) {

                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}


public class WindowTest {
    public static void main(String[] args) {
        Window t1 = new Window();

        Window window = new Window();

        Thread w1 = new Thread(window);
        w1.setName("过去");
        Thread w2 = new Thread(window);
        w2.setName("现在");
        Thread w3 = new Thread(window);
        w3.setName("未来");

        w1.start();
        w2.start();
        w3.start();
    }
}
