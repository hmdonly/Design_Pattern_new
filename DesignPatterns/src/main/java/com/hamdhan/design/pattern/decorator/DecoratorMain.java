package com.hamdhan.design.pattern.decorator;

public class DecoratorMain {

  public static void main (String args[]) {
      Circle circle = new Circle();
      circle.draw();
      System.out.println("Red Borde call");
      RedShapeDecorator rd = new RedShapeDecorator(new Circle());
      rd.draw();
  }
}
