package com.bp.epam;

public class HomeWork3 {

    public static void main(String[] a) {
        String res1 = "res1";
        String res2 = "res2";
        String res3 = "res3";
        String res4 = "res4";
        Thread t1 = new MyThread(1, res1, res2);
        Thread t2 = new MyThread(2, res2, res3);
        Thread t3 = new MyThread(3, res3, res4);
        Thread t4 = new MyThread(4, res4, res1);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
