package com.tothenew.bootcamp.First.OtherQuestions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager
{
    @Autowired
    Worker worker;

    Manager(Worker worker){
        this.worker=worker;
    }
    void manager(){
        worker.doWork();
    }
}
