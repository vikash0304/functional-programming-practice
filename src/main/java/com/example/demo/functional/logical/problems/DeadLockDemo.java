package com.example.demo.functional.logical.problems;

public class DeadLockDemo {

    public static void main(String[] args) {
        StringBuilder obj1 = new StringBuilder("deadlock demo");

        Thread t1 = new Thread(()-> {
            System.out.println("Accessing Object: "+obj1);
            obj1.append("t1-appended");
        });

        Thread t2 = new Thread(()-> {
            System.out.println("Accessing Object: "+obj1);
            obj1.deleteCharAt(1);
        });

for(int i=0; i<2; i++) {
    t1.start();
    t2.start();
}
    }




}
