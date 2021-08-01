package com.psychic.java;
//使用同步机制将单例模式中的懒汉式改写为线程安全的
public class BankTest {
    public static void main(String[] args) {
        System.out.println("I have a dream!");

    }
}

class Bank {

    private Bank() {
    }

    public static Bank instance = null;

    public static Bank getInstance() {
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;

    }
}