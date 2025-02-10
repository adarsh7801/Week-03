//Package
package com.singlylinkedlist.studentrecordmanagement;

//Student class
public class Student {
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;


    //constructor
    public Student(String name,  int age, int rollNumber, char grade){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
