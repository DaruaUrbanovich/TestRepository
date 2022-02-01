package com.company;

public class Main {

    public static void main(String[] args) {
Person person=new Person();
person.eat();
person.breathe();
person.holdBreathe();
person.sneeze();
Animal animal=new Animal();
animal.eat();
animal.breathe();
animal.holdBreathe();
animal.sneeze();


    }

    public void breath(Breathing b) {
        b.breathe();
        b.holdBreathe();
        b.sneeze();

    }


}
