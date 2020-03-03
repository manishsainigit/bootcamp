package com.tothenew.bootcamp.First.Q1;

public class Manager {
    public void lazyWorker(){
        System.out.println("I'm lazy worker");
        new Manager().doWork();
    }
    public void doWork(){
        System.out.println("Doing worker");
    }
}
