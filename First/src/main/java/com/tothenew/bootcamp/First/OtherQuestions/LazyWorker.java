package com.tothenew.bootcamp.First.OtherQuestions;

import org.springframework.stereotype.Component;

@Component
public class LazyWorker implements Worker {
    @Override
    public void doWork() {
        System.out.println("LazyWorker is doing work");
    }
}
