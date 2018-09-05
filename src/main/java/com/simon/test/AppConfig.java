package com.simon.test;

import com.sun.xml.internal.ws.developer.Serialization;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

@Configuration
public class AppConfig {

    @Bean(initMethod = "init")
    public Foo foo() {
        return new Foo();
    }

    @Bean(destroyMethod = "cleanup")
    public Bar bar() {
        return new Bar();
    }
}

class Foo {

    public void init() {
        System.out.println("Foo init");
    }
}

class Bar {

    public void cleanup() {
        System.out.println("Bar cleanup");
    }
}