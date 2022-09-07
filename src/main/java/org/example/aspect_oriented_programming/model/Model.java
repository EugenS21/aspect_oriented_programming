package org.example.aspect_oriented_programming.model;

import org.springframework.stereotype.Component;

@Component
public class Model {

    public void letMeDoIt(String first, Integer second) {
        System.out.println("-----My method let me do it!");
    }
    public void letMeDoItWithException(String first, Integer second) throws IllegalAccessException {
        System.out.println("-----My method let me do it!");
        if (second == 0 ) throw new IllegalAccessException();
    }

}
