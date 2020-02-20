package com;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Q5 obj=new Q5();
        obj.ThreadMethod();


    }
    public void ThreadMethod(){
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                method1();
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                method2();
            }
        });
        t1.start();
        t2.start();
    }
    public void method1() {
        synchronized (this){
            System.out.println("Running Thread 1");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Again came to Thread 1");
            System.out.println("Thread one completed:)");
        }
    }
    public void method2(){
        synchronized (this){
            System.out.println("Running Thread 2");
            System.out.println("Press Enter key.");
            new Scanner(System.in).nextLine();
            System.out.println("Got it.");
            System.out.println("Thread two completed:)");
            notify();
        }

    }
}
