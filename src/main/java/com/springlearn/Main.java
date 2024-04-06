package com.springlearn;

import com.springlearn.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/bean-config.xml");
        Student s = context.getBean("student1", Student.class);
        System.out.println(s.getName());
        System.out.println(s.getMarksheet().getMarkSheetName());
        System.out.println(s.getMarksheet().getMarkSheetGrade());
    }
}