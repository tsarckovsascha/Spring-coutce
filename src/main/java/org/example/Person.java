package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(value = "prototype")
public class Person {
    @Value(value = "${person.name}")
    String name;
    @Value(value = "${person.age}")
    int age;

    //    @Autowired
//    @Qualifier(value = "dog")
    private final Pet pet;

    void comeMy() {
        System.out.println("Hrllo my pet");
        pet.say();
    }

    @Autowired
    public Person(Pet pet) {
        this.pet = pet;
    }


    //@Autowired
//@Qualifier(value = "dog")
//    public void setPet(Pet pet) {
//        this.pet = pet;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
@PostConstruct
    public void init(){
        System.out.println("init methode class Person");
    }

}
