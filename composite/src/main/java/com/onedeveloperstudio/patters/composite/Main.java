package com.onedeveloperstudio.patters.composite;

/**
 * User: y.zakharov
 * Date: 24.07.14
 */
public class Main {
  public static void main(String... args){
    Ellipse ellipse1 = new Ellipse();
    Ellipse ellipse2 = new Ellipse();
    Square square1 = new Square();
    Square square2 = new Square();



    CompositeGraphic graphics1 = new CompositeGraphic();
    graphics1.add(ellipse1);
    graphics1.add(ellipse2);
    graphics1.add(square1);
    CompositeGraphic graphics2 = new CompositeGraphic();
    graphics1.add(square2);
    CompositeGraphic graphics3 = new CompositeGraphic();
    graphics3.add(graphics1);
    graphics3.add(graphics2);
    graphics3.print();
  }
}
