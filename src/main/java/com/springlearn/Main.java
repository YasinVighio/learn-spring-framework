package com.springlearn;

import com.springlearn.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
        ---------------------------------------------------------------------------------
        ApplicationContext and IoC container are closely related.

        AppContext is a type of IoC container.

        It extends the BeanFactory interface.

        It is an interface itself, therefore it can be implemented by its implementations.

        Its implementations are as follows:
             1. ClassPathXmlApplicationContext
             2. FileSystemXmlApplicationContext
             3. AnnotationConfigApplicationContext


        ApplicationContext is a key component responsible for managing beans, providing features
        such as dependency injection,
                lifecycle management of beans,
                event propagation,
                internationalization, and others
        ---------------------------------------------------------------------------------
         */

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

    }
}