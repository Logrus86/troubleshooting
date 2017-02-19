package com.bp.epam;

public class HomeWork1 {

    public static void main(String[] a) {
        String res1 = "res1";
        String res2 = "res2";
        Thread t1 = new MyThread(1, res1, res2);
        Thread t2 = new MyThread(2, res2, res1);
        t1.start();
        t2.start();
    }

}
