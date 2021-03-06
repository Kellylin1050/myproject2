package com.kelly.score;

public class Student implements Printable{
    protected String name;
    public int english;
    protected int math;
    public Student(String name) { //constructor
        this.name = name;
    }
    public Student(String name, int english, int math) {//constructor
        this(name);
        //this.name = name;
        this.english = english;
        this.math = math;
    }
    public Student(){//Default constructor
    }
    public void print() {
        System.out.print
                (name + "\t" + english + "\t" + math + "\t" + getAverage());

        if (getAverage() < 60) {
            System.out.print("*");
        }
        System.out.println();
    }
    public int getAverage() {
        return (english+math)/2;
    }
}