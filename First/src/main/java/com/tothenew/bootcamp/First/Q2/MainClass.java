package com.tothenew.bootcamp.First.Q2;

public class MainClass {

    public static void main(String[] args) {
        Manager manager=new Manager(new LazyWorker());
        manager.manage();
    }
}
