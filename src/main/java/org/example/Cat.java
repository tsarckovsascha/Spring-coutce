package org.example;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet{

    public Cat() {
        System.out.println("Cat id creating");
    }

    public void say() {
        System.out.println("Mau-Mau");
    }

    public void init(){
        System.out.println("Init method class Cat ");
    }

    public void destroy(){
        System.out.println("Destroy method class Cat ");
    }


}
