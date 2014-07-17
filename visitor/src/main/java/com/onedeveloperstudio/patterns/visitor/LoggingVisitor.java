package com.onedeveloperstudio.patterns.visitor;

/**
 * User: y.zakharov
 * Date: 17.07.14
 */
public class LoggingVisitor implements Visitor {
  @Override
  public void visit(RoundHouse house) {
    house.setSpace((int) (house.getRadius()*house.getRadius()*Math.PI));
    System.out.println("round house space:" + house.getSpace());
  }

  @Override
  public void visit(SquareHouse house) {
    house.setSpace(house.getSize()*house.getLength());
    System.out.println("round house space:" + house.getSpace());
  }
}
