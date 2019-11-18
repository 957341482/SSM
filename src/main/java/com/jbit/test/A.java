package com.jbit.test;

public class A {
    private static A a = new A();

    public A(){
        System.out.println("非A");
    }
    {
        System.out.println("A");
    }
    static {
        System.out.println("static");
    }
}
