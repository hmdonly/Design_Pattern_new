package com.hamdhan.design.pattern.decorator;

public class RedShapeDecorator extends ShapeDecorator{

    RedShapeDecorator(Shape shape){
       super(shape);
    }
    public void draw(){
        shapeDecorator.draw();;
        setBorder();
    }

    private void setBorder() {
      System.out.println("RFed border");
    }
}
