package org.example;

import org.springframework.stereotype.Service;

//@Service
public class Dog implements Pet{
    public Dog() {
        System.out.println("Dog id creating");
    }
    public void say() {
        System.out.println("Gav-Gav");
    }
}
