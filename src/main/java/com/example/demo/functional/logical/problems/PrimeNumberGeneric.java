package com.example.demo.functional.logical.problems;

public class PrimeNumberGeneric {

    static int count = 0;

    public static synchronized void increamentCount() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {

        long starttime = System.currentTimeMillis();
        int max=100000;
        int noOfThreads = 8;
        int rangePerThread = max/noOfThreads;

        Thread[] threads = new Thread[noOfThreads];

        for(int i=0; i<noOfThreads; i++) {
            int start = i * rangePerThread + 1;
            int end = (i == rangePerThread + 1) ? max : start + rangePerThread - 1;

            int finalI = i;
            threads[i] = new Thread(() -> {
                for (int num = start; num <= end; num++) {
                    if (isPrime(finalI)) {
                        increamentCount();
                    }
                }
            });
            threads[i].start();
        }
        for(Thread t: threads) {
            t.join();
        }
        long endtime = System.currentTimeMillis();
        long totalTime = endtime - starttime;
        System.out.println("Total prime numbers: " + count);
        System.out.println("Total time taken in ms: " + totalTime);
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
