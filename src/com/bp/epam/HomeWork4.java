package com.bp.epam;

public class HomeWork4 {

    public static void main(String[] a) {
        String resource = "resource";
        MyThread t1 = new MyThread(1, resource, new Object());
        Thread t2_1 = new MyThread(21, resource, new Object());
        Thread t2_2 = new MyThread(22, resource, new Object());
        Thread t2_3 = new MyThread(23, resource, new Object());
        Thread t2_4 = new MyThread(24, resource, new Object());
        t1.setMillisWaitBeforeSecondResource(30000);
        t1.start();
        t2_1.start();
        t2_2.start();
        t2_3.start();
        t2_4.start();
    }

}
