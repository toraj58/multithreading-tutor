package com.touraj.tutorpart3;

/**
 * Created by toraj on 06/26/2017.
 */
public class TaskCounter implements Runnable {


    public void run() {

        if (Thread.currentThread().getName().equals("cnt1")) {
//            Thread.yield();
        }

        String str1 = "Select * from user";
        String str2 = "Select * from user";
        String str3 = "Select * from user";
        String str4 = "Select * from user";

        int maxLoopNumber = 1000000000;

        System.out.println("Task Counter Begin");

        for (int i = 1; i <=maxLoopNumber ; i++) {

            if (i % 2 == 0 && i != 0) {
//                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName() + " :: " + i);
        }

        System.out.println("Task Counter End");
    }

}
