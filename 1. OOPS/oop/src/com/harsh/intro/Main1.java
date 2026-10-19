package com.harsh.intro;

public class Main1 {
    public static void main(String[] args) {
        // store 5 roll numbers :
        int[] rollNo = new int[5];

        // store 5 names :
        String[] names = new String[5];

        // Store 5 students : each student must have : {roll no, name, marks}
        //int[] rollNos = new int[5];
        //String[] name = new String[5];
        //float[] marks = new float[5]; Here, we created a new DS for each property of the entity (this is tedious if tehre are many properties), Hence to combine properties and functions(methods) in single entity we use class (i.e create our own dt)

        // After creating a Student class, we can create its object/entity as :
        Student harsh = new Student(); // it consists of 3 properties - rollNos,name,marks. They are initialized with default values until we define them

        System.out.println("Hello");
    }
}

// create a class
class Student {
    int[] rollNos = new int[5];
    String[] name = new String[5];
    float[] marks = new float[5];
}