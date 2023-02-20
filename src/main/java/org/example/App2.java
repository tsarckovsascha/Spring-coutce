package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigurationApp.class);

        Person person = context.getBean("person", Person.class);
        person.comeMy();

        System.out.println(person.age);
        System.out.println(person.name);

        context.close();
    }
}
