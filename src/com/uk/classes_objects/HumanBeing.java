package com.uk.classes_objects;

public class HumanBeing {

    // Objects below are instance variable, which are unique.
    String name;
    String gender;
    int age;
    int height;
    String eyeColor;
    String bloodGP;
    int weight;

    //class variables. They are stored at class level.
    final static int NUM_EYES = 2;
    final static int NUM_LEGS = 2;
    final static int NUM_HANDS = 2;

    HumanBeing(String name){
        this.name = name;
//        breathe();
    }
    HumanBeing(){

    }
    HumanBeing(String name,String Gender){
        this.name = name;
        this.gender = Gender;
        breathe();
    }

    //Behavior of objects
    //Method overloading - same name method with the different parameters are called method overloading also with different parameter orders
    void talk(){
        System.out.println(name + " is talking");
    }

    void talk(int loudness){
        System.out.println(name + " is talking with a loudness of " + loudness);
    }

    void talk(String language, int loudness){
        System.out.println(name + " is talking in " + language + " with a loudness of " + loudness);

    }

    void eat(){
        System.out.println(name + " is eating");
    }
    void sleep(){
        System.out.println(name + " is sleeping");
    }
    void breathe(){
        System.out.println(name + " is breathing");
    }

    // only static variable can be used in static methods
    static void doSomething(String something){
        System.out.println("HumanBeing is doing something with " + NUM_HANDS + " hands");
    }


}
