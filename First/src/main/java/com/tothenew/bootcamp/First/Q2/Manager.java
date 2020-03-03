package com.tothenew.bootcamp.First.Q2;

public class Manager {
    private Worker worker;
    public void manage(){
        System.out.println("Manager");
        worker.doWork();

    }
    Manager(Worker worker){
        this.worker=worker;
    }
}
