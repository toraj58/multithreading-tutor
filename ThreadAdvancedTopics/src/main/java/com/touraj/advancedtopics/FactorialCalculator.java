package com.touraj.advancedtopics;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by toraj on 06/25/2017.
 */
public class FactorialCalculator implements Callable<Long> {


    private int n;

    public FactorialCalculator(int n) {
        this.n = n;
    }

    @Override
    public Long call() throws Exception {

        if (n < 1) {
            return 0L;
        }

        Long fact=1l;
        for (int i = 2; i <=n ; i++) {

            fact*=i;
        }

        return fact;
    }
}
