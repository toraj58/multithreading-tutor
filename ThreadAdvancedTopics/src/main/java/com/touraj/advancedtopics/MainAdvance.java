package com.touraj.advancedtopics;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by toraj on 06/25/2017.
 */
public class MainAdvance {
    public static void main(String[] args) {
        System.out.println("Main Advanced Topics");

        new MyWorker().run();
        Thread t =  new Thread(new MyWorker());
        t.start();
//        t.interrupt();

//        ExecutorService executor = Executors.newSingleThreadExecutor();

        ExecutorService executor = Executors.newFixedThreadPool(10);
        Future<Long> future = executor.submit(new FactorialCalculator(2));

        System.out.println("Thread Pool Size is :: " + ((ThreadPoolExecutor)executor).getPoolSize());
        System.out.println("Thread Active Count is :: " + ((ThreadPoolExecutor)executor).getActiveCount());

        executor.shutdown();

        System.out.println("future done? " + future.isDone());

        Long result = null;
        try {
            result = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("future done? " + future.isDone());
        System.out.println("result: " + result);

        ExecutorService executor2 = Executors.newWorkStealingPool();

/*        List<Callable<String>> callables = Arrays.asList(
                () -> "task1",
                () -> "task2",
                () -> "task3");*/

        System.out.println("1||||||| :: " + ((ForkJoinPool) executor2).getPoolSize());
        System.out.println("A1||||||| :: " + ((ForkJoinPool) executor2).getActiveThreadCount());

        List<Callable<Long>> callables = Arrays.asList(
                new FactorialCalculator(5),
                new FactorialCalculator(6),
                new FactorialCalculator(7),
                new FactorialCalculator(8),
                new FactorialCalculator(9),
                new FactorialCalculator(10)
        );

        try {
            executor2.invokeAll(callables)
                    .stream()
                    .map(future2 -> {
                        try {
                            return "out is :: " + future2.get();
                        }
                        catch (Exception e) {
                            throw new IllegalStateException(e);
                        }
                    })
                    .forEach(System.out::println);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("2||||||| :: " + ((ForkJoinPool) executor2).getPoolSize());
        System.out.println("A2||||||| :: " + ((ForkJoinPool) executor2).getActiveThreadCount());

        executor2.shutdown();

        System.out.println("3||||||| :: " + ((ForkJoinPool) executor2).getPoolSize());
        System.out.println("A3||||||| :: " + ((ForkJoinPool) executor2).getActiveThreadCount());

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=--=");

        ScheduledExecutorService exe = Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Scheduling: " + System.nanoTime());
            }
            catch (InterruptedException e) {
                System.err.println("task interrupted");
            }
        };

        exe.scheduleWithFixedDelay(task, 0, 1, TimeUnit.SECONDS);
//        exe.shutdown();
    }
}
