package com.example;

import org.apache.commons.lang3.StringUtils;

public class HelloWorld {
    public static String greet(String name) {
        if (StringUtils.isBlank(name)) {
            return "Hello, World!";
        }
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(greet("Tester"));
    }
}
