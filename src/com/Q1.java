package com;

import java.util.Scanner;

class Q1{
    private static volatile boolean run=true;
    public static void main(String[] args) {

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                while(run){
                    System.out.println("HI:)");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();

        new Scanner(System.in).nextLine();
        Q1.action();


    }
    public static void action(){
        run=false;
    }
}