package com;

public class Q10 {
    public static void main(String[] args) {
        String str1="hi";
        String str2="hello";
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread first is running");
                synchronized (str1){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread first got first string and waiting for string second");
                    synchronized (str2){
                        System.out.println("Thread first got both string");
                        System.out.println(str1+" "+str2);
                    }
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread second is running");
                synchronized (str2){
                    System.out.println("Thread second got second string and waiting for first string");
                    synchronized (str1){
                        System.out.println("Thread second got both string");
                        System.out.println(str2+" "+str1);
                    }
                }
            }
        });
        t1.start();
        t2.start();

    }
}
