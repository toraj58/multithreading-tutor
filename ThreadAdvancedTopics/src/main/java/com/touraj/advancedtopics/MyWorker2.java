package com.touraj.advancedtopics;

import java.util.concurrent.TimeUnit;

/**
 * Created by toraj on 06/24/2017.
 */
public class MyWorker2 extends Thread {

    String sharedStr = "salam";

    private  ThreadLocal<String> strLocal = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
//            System.out.println("Initializing StringLocal for - " + Thread.currentThread().getName() );
            return new String("akhe agha in Doroste?");
        }
    };



    public String getSharedStr() {
        return sharedStr;
    }

    public void setSharedStr(String sharedStr) {
        this.sharedStr = sharedStr;
    }

    @Override
    public void run() {

        if (Thread.currentThread().getName().equals("t2")) {
            strLocal.set("bodo biyaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        }


        int cnt=0;
        while (true) {

            cnt++;

            if (cnt > 10000) {
                setSharedStr("oghlidoooooooooooooooooooooooooooooooooooooooon");
            }

            System.out.println(">>> :: " +  Thread.currentThread().getName() + " :: " + sharedStr);
            System.out.println("<<<< " +  Thread.currentThread().getName() + " :: " + strLocal.get());
        }

    }
}
