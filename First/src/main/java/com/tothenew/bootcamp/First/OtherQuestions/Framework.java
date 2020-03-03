package com.tothenew.bootcamp.First.OtherQuestions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Framework
{
    public static void main(String[] args) {
        ApplicationContext applicationContext= SpringApplication.run(Framework.class,args);
        //Q4 Get a spring bean from application context
        Manager manager=applicationContext.getBean(Manager.class);
        manager.manager();

    }
}
