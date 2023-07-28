package com.divij.test;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.divij.test.lib.Sim;

@SpringBootApplication
public class App {
    public static void main(String[] args) {

        // Without DI
        // Airtel airtel = new Airtel();
        // airtel.call();
        // airtel.internet();

        // With DI
        ApplicationContext context = new ClassPathXmlApplicationContext("./bean.xml");
        Sim sim  = context.getBean("sim", Sim.class);
        sim.call();
        sim.internet();
    }
}