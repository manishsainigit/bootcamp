package com.tothenew.bootcamp.First.OtherQuestions;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//resolve ambiguity while autowiring bean (Hint : @Primary)
@Primary
public class SmartWorker implements Worker {

    @Override
    public void doWork() {
        System.out.println("Smart Worker is doing work");
    }
}
