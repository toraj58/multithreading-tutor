package com.touraj.threadtutorial;


/**
 * Created by toraj on 06/24/2017.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Main Begin");

        String str1 = "Touraj1";
        String str2 = "Touraj2";



     /*   Thread t1 = new Thread( new MyWorker(), "MyThread1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("in Anonymous Method ");

            }
        });

        t2.start();

        new Thread(()-> System.out.println("in Lambda Expression")).start();

        new Thread(()->{
            System.out.println("lambda Iine1");
            System.out.println("lambda Iine2");
            System.out.println("lambda Iine3");
        }).start();

        t1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MyTask mt = new MyTask();
        mt.setName("TTT1");
        mt.start();*/

     Thread b1 = new Thread(new MyCounter(), "cnt1");
     Thread b2 = new Thread(new MyCounter(), "cnt2");
     Thread b3 = new Thread(new MyCounter(), "cnt3");

        b3.setPriority(Thread.MAX_PRIORITY);
        b2.setPriority(Thread.NORM_PRIORITY);
        b1.setPriority(Thread.MIN_PRIORITY);

        b1.start();
        b2.start();
        b3.start();

/*        try {
            b1.join();
            b2.join();
            b3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        System.out.println("Near End...");


        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("End...");


/*        try {
            b1.join();
            b2.join();
            b3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

//        System.out.println("******************* hasanam ******************");

/*        b3.setPriority(10);
        b2.setPriority(5);
        b1.setPriority(1);*/

//        System.out.println("Main End!");
    }

}
