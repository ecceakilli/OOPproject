package com.eceakilli.oopproject;

public class Dog extends Animal {
    public void test(){
        //super extend ettigi sınıfı referans alır
        super.sing();
    }
    public void sing(){
        System.out.println("dog class");
    }
}
