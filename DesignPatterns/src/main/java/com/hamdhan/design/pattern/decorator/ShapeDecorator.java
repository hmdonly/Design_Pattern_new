package com.hamdhan.design.pattern.decorator;

public abstract class ShapeDecorator implements Shape{

    protected Shape shapeDecorator;

    ShapeDecorator(Shape shape){
        this.shapeDecorator = shape;
    }
    @Override
    public void draw() {
        shapeDecorator.draw();
    }
}
