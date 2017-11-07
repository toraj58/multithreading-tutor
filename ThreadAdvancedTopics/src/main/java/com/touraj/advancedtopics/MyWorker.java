package com.touraj.advancedtopics;

import java.util.concurrent.TimeUnit;

/**
 * Created by toraj on 06/24/2017.
 */
public class MyWorker implements Runnable {


    @Override
    public void run() {

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName());
        System.out.println("silimalek");

    }
}
