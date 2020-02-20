package com.Q3;

public class Q3 {
    private int count=0;
    public static void main(String[] args) throws InterruptedException {
        Q3 obj = new Q3();
        obj.thread();
    }
    synchronized public void increment(){
        count++;
    }
    public void thread() throws InterruptedException {

            Thread t1=new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Hi t1");
                    for(int i=0; i<1000;i++){
                        increment();
                    }
                }
            });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello t2");
                for(int i=0; i<1000;i++){
                    increment();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);

        }
    }
