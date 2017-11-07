package com.touraj.threadtutorial;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by toraj on 06/24/2017.
 */
public class MyTask extends Thread {

    public void run()
    {
        System.out.println("In MyTask Method1");
        System.out.println("In MyTask Method2");
        System.out.println("In MyTask Method3");

        System.out.println("****** :: " + this.getName());

        System.out.println("In MyTask Method3");
        System.out.println("In MyTask Method3");
        System.out.println("In MyTask Method3");
        System.out.println("In MyTask Method3");
        System.out.println("In MyTask Method3");
    }

}
