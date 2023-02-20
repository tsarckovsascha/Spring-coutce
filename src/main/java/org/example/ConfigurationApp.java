package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example")
@PropertySource(value = "classpath:applicationProperty.properties")
public class ConfigurationApp {

//    @Bean
//    public Cat cat() {
//        return new Cat();
//    }
//
//    @Bean
//    public Person person() {
//        return new Person(cat());
//    }
}
