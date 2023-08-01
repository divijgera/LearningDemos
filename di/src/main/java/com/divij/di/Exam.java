package com.divij.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

    public Exam() {
        // Setter DI without IOC
        // Student student = new Student();
        // student.setName("Divij");

        // student.printInfo();

        // Setter DI with IOC
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student divij = context.getBean("divij", Student.class);
        divij.printInfo();
        divij.getMajor();

        Student sahil = context.getBean("sahil", Student.class);
        sahil.printInfo();
        sahil.getMajor();
    }
    
}
