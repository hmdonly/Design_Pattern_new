package com.hamdhan.design.pattern.decorator;

public class Circle implements  Shape{
    @Override
    public void draw() {
        System.out.println("inside draw:Circle");
    }
}
