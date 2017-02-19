package com.bp.epam;

/**
 * Created by User on 19.02.2017.
 */
public class MyThread extends Thread {

    private final int number;
    private final Object resourceToHold;
    private final Object resourceToWait;
    private int millisWaitBeforeSecondResource = 50;

    public MyThread(int number, Object resourceToHold, Object resourceToWait) {
        this.number = number;
        this.resourceToHold = resourceToHold;
        this.resourceToWait = resourceToWait;
    }

    public void setMillisWaitBeforeSecondResource(int millis) {
        this.millisWaitBeforeSecondResource = millis;
    }

    public void run() {
        System.out.println("Thread " + number + ": Waiting for resource: " + String.valueOf(resourceToHold));
        synchronized (resourceToHold) {
            System.out.println("Thread " + number + ": Got it! Holding resource: " + String.valueOf(resourceToHold));
            try {
                Thread.sleep(millisWaitBeforeSecondResource);
            } catch (InterruptedException ignored) {
            }
            System.out.println("Thread " + number + ": Waiting for resource: " + String.valueOf(resourceToWait));
            synchronized (resourceToWait) {
                System.out.println("Thread " + number + ": Got it! Holding both resources ! NO DEADLOCK!");
            }
        }
    }

}
