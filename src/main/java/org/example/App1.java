package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicicationContext1.xml");

        Pet cat = context.getBean("cat", Pet.class);
   //     Pet dog = context.getBean("dog", Pet.class);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Person person = context.getBean("person",Person.class);
        Person person1 = context.getBean("person",Person.class);
        person.comeMy();
        System.out.println(person.age);
        System.out.println(person.name);

        context.close();
    }
}
