package com.harsh.intro;

class Students {
    int rollNo;
    String name;
    float marks = 80; // Explicitly initialised to 80 instead of Java's default value (0.0f).This value can be changed (overriden) later if user assign a value to it.

    // Constructor
//    Students() {
//        rollNo = 18;
//        name = "ABC";
//        marks = 50;
//    } used for: Student s1 = new Student();

//    Students(int rollNo,String name,float marks) {
//        rollNo = rollNo;
//        name = name;
//        marks = marks;
//    } used for: Student s1 = new Student(10,"XYZ",60.0);

    Students() {
        this.rollNo = 10;
        this.name = "XYZ";
        this.marks = 60.0f;
    }

    Students(int rollNo,String name,float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }


    void display() {
        Students s; // If a reference variable is declared inside a method, Java does not assign it a default value.
        // System.out.println(s); // Compilation error
    }
}

public class Lecture1 {
    public static void main(String[] args) {
        Students s; // Declaring the Instance reference variable(it does not creates an object just gives a reference): Default value is null
        // creation of objects: 'new' keyword dynamically allocates the memory at runtime
        // Student s1;
        // s1 = new Student();
        Students s1 = new Students(); // rollNo=0, name=null (not ""), marks=0.0f
        // Before assigning the values :
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.marks);

        // After assigning values:
        s1.name = "Harsh";s1.rollNo=45;s1.marks=90.5f;
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.marks);
        // System.out.println(s1.salary); Error:Cannot resolve symbol 'salary' in Student type (class)

        Students s2 = new Students(11,"Rahul",85);
        System.out.println("Name: " + s2.name + ", Roll No: " + s2.rollNo + ", Marks: " + s2.marks);
    }
}
