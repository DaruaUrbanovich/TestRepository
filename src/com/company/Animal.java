package com.company;

 class Animal implements Eating,Breathing{
//    private String title;
//
//     public Animal(String title) {
//         this.title = title;
//     }
//
//     public String getTitle() {
//         return title;
//     }
//
//     public void setTitle(String title) {
//         this.title = title;
//     }

     @Override
    public void eat() {
         System.out.println("Class Animal,method eat");
    }

    @Override
    public void breathe() {
        System.out.println("Class Animal,method breathe");
    }

    @Override
    public void holdBreathe() {
        System.out.println("Class Animal,method holdBreathe");
    }

    @Override
    public void sneeze() {
        System.out.println("Class Animal,method sneeze");
    }


//     @Override
//     public String toString() {
//         return "Animal{}";
//     }
 }
