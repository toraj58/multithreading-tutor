package com.touraj.threadtutorial;

/**
 * Created by toraj on 06/24/2017.
 */
public class MyCounter implements Runnable {
    @Override
    public void run() {


        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (Thread.currentThread().getName().equals("cnt2")) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i <= 1000000000 ; i++) {

            if (Thread.currentThread().getName().equals("cnt2")) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (i % 100 ==0 && i != 0) {
                Thread.yield();
            }
            System.out.println("Conunter :: " + i + " :: " + Thread.currentThread().getName());

        }

    }
}
