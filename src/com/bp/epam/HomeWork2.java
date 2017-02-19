package com.bp.epam;

public class HomeWork2 {

    public static void main(String[] a) {
        String res1 = "res1";
        String res2 = "res2";
        Thread t1 = new MyThread(1, res1, res2);
        Thread t2 = new MyThread(2, res2, res1);
        Thread t1_1 = new MyThread(11, res1, new Object());
        Thread t1_2 = new MyThread(12, res1, new Object());
        Thread t1_3 = new MyThread(13, res1, new Object());
        Thread t2_1 = new MyThread(21, res2, new Object());
        Thread t2_2 = new MyThread(22, res2, new Object());
        Thread t2_3 = new MyThread(23, res2, new Object());
        t1.start();
        t2.start();
        t1_1.start();
        t1_2.start();
        t1_3.start();
        t2_1.start();
        t2_2.start();
        t2_3.start();
    }

}
