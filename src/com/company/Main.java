package com.company;

abstract class MyClass {
    public void display() {
        System.out.println("Concrete Method of Parent Class");
    }
    abstract public void display2();
}

class Try extends MyClass {
    public void display2() {
        System.out.println("Overreding abstract method");
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
        Try obj = new Try();
        obj.display2();
    }
}
