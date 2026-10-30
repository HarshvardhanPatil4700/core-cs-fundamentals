package com.harsh.intro;

import java.util.Arrays;

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
        Student[] students = new Student[5]; // All objects consists of 3 properties - rollNos,name,marks. They are initialized with default values until we define/initialize them
        int age;

        Student demo = new Student(); // object creation
        Student demos; // assigning a reference variable
        System.out.println(Arrays.toString(students)); // In java, if reference variable is not declared then Java automatically initializes it to null.
    }
}

// create a class
class Student {
    int rollNo; //  instance variables
    String name;
    float mark;
}