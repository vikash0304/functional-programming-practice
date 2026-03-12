package com.example.demo.functional.logical;

public class PrimeNumber {

    static int count = 0;
    public static synchronized void increamentCount() {
        count++;
    }
    public static void main(String[] args) throws InterruptedException {

        long starttime = System.currentTimeMillis();

     Thread t1 = new Thread(()-> {
         for(int i=2; i<=25000; i++) {
             if(isPrime(i)) {
                 increamentCount();
//                 System.out.println(i+ ", ");
             }
         }
     });
        Thread t2 = new Thread(()-> {
            for(int i=25001; i<=50000; i++) {
                if(isPrime(i)) {
//                    System.out.println(i+ ", ");
                    increamentCount();
                }
            }
        });

        Thread t3 = new Thread(()-> {
            for(int i=50001; i<=75000; i++) {
                if(isPrime(i)) {
                    increamentCount();
//                    System.out.println(i+ ", ");
                }
            }
        });
        Thread t4 = new Thread(()-> {
            for(int i=75001; i<=100000; i++) {
                if(isPrime(i)) {
                    increamentCount();
//                    System.out.println(i+ ", ");
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
//        for(int i=2; i<=100000; i++ ) {
//            if(isPrime(i)) {
//                increamentCount();
////                System.out.println(i+ ", ");
//
//            }
//        }
        long endtime = System.currentTimeMillis();
        long totalTime = endtime-starttime;
        System.out.println("Total prime numbers: "+count);
        System.out.println("Total time taken in ms: "+totalTime);
    }

    private static boolean isPrime(int n) {
        for(int i=2; i<n; i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
