package com.example.demo.functional.logical.problems;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.start();

        Thread myThread2 = new Thread(new MyRunnable());
        myThread2.start();

        Thread t2 = new Thread(() -> {
           System.out.println("second thread called");
        });
        t2.start();

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(()->{
            System.out.println("Thread executed from executor service.");
        });
        executorService.shutdown();
    }
}

class MyThread extends Thread {
    public void run(){
        System.out.println("Thread is running!");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running from Runnable");
    }
}
