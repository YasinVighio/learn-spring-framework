package com.springlearn;

import com.springlearn.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config/bean-config.xml");
        Student s = context.getBean("student1", Student.class);
        System.out.println(s.getName());
        s.getMarksheet().stream().forEach(
                marksheet -> System.out.println("Marksheet: " + marksheet.getMarkSheetName() + "\nGrade: " +marksheet.getMarkSheetGrade())
        );

        s.getContacts().stream().forEach(
                contact->System.out.println("Contact: " +contact)
        );

        s.getAddressMap().entrySet().stream().forEach(
                entry->System.out.println(entry.getKey() + " addr "+ entry.getValue().getAddress()
                        + " cntct " + entry.getValue().getAddressContact())
        );

        System.out.println("Cert: "+s.getCertifcate().toString());

    }
}