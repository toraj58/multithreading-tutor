package com.touraj.threadtutorial;

/**
 * Created by toraj on 06/24/2017.
 */
public class MyWorker implements Runnable {
    @Override
    public void run() {

        System.out.println("begning of the run method");
        System.out.println("do something intersing");

        System.out.println("----------------- : " + Thread.currentThread().getName());

        System.out.println("end of the run method");

    }
}
