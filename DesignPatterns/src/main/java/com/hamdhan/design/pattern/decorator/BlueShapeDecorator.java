package com.hamdhan.design.pattern.decorator;

public class BlueShapeDecorator extends ShapeDecorator{
    BlueShapeDecorator(Shape shape) {
        super(shape);
    }
    public void draw(){
        shapeDecorator.draw();
        setBorder();
    }

    private void setBorder() {
      System.out.println("Blue border");
    }
}
