package com;

import static java.lang.Thread.sleep;

public class Q2 {
    public static void main(String[] args) throws InterruptedException {
        UseThread T_Obj=new UseThread();
        Thread R_obj=new Thread(new UseRunnable());
        T_Obj.start();
        R_obj.start();
    }
}
class UseThread extends Thread{
    public void run(){
        for(int i=0;i<10;i=i+2){
            System.out.println("Even: "+i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
class UseRunnable implements Runnable{
    public void run(){
        for(int i=1;i<10;i=i+2){
            System.out.println("odd: "+i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
