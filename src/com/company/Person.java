package com.company;

 class Person implements Eating, Breathing{

     //    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//     public Person(String name) {
//         this.name = name;
//     }

     @Override
    public void eat() {
         System.out.println("Class Person,method eat");
        }

    @Override
    public void breathe() {
        System.out.println("Class Person,method breathe");
    }

    @Override
    public void holdBreathe() {
        System.out.println("Class Person,method holdBreathe");
    }

    @Override
    public void sneeze() {
        System.out.println("Class Person,method sneeze");
    }



//     @Override
//     public String toString() {
//         return "Person{}";
//     }
 }
