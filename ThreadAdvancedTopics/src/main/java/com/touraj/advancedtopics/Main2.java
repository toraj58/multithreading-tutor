package com.touraj.advancedtopics;

/**
 * Created by toraj on 06/25/2017.
 */
public class Main2 {

    public static void main(String[] args) {
        System.out.println("Main2 ... ");


        MyWorker2 m1 = new MyWorker2();
        MyWorker2 m2 = new MyWorker2();
        MyWorker2 m3 = new MyWorker2();

//        m2.setSharedStr("oghlidoooooooooooooooooooon");

        Thread t1 = new Thread(m1, "t1");
        Thread t2 = new Thread(m1, "t2");
        Thread t3 = new Thread(m1, "t3");



        t1.start();
        t2.start();
        t3.start();

    }

}
