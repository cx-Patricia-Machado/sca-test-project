package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testGreet() {
        assertEquals("Hello, Alice!", HelloWorld.greet("Alice"));
        assertEquals("Hello, World!", HelloWorld.greet(""));

        //This is another test
    }
}
