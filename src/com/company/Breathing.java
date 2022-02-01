package com.company;

public interface Breathing {
    void breathe();

    void holdBreathe();

    default void sneeze() {
        System.out.println("I sneezed");
    }

}
