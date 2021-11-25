package com.hamdhan.design.pattern.decorator;

public class Rectangle implements Shape{

    @Override
    public void draw() {
       System.out.println("inside draw:Rectangle");
    }
}
