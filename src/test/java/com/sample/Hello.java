package com.sample;

/**
 * Created by duongnapham on 3/2/15.
 */
public class Hello {
    private final String greeting;
    public Hello(String greeting) {
        this.greeting = greeting;
    }
    public String sayHi() {
        return greeting + " World";
    }
}
