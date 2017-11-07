package com.touraj.tutorpart3;

import java.util.concurrent.TimeUnit;

/**
 * Created by toraj on 06/26/2017.
 */
public class MainPart3 {


    public static void main(String[] args) {
        System.out.println("Main for Part3");

/*        try {
            TimeUnit.SECONDS.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        TaskCounter c1 = new TaskCounter();
        TaskCounter c2 = new TaskCounter();
        TaskCounter c3 = new TaskCounter();

        Thread t1 = new Thread(c1 , "cnt1");
        Thread t2 = new Thread(c2 , "cnt2");
        Thread t3 = new Thread(c3 , "cnt3");

/*        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);*/

        t1.start();
        t2.start();
        t3.start();

        try {

            t1.join();
            t2.join();
            t3.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i <10 ; i++) {

            System.out.println(">>>>> Main Part 3 :: " + i);

        }

        System.out.println("************ Main Part 3 Ended *************");

    }

}
