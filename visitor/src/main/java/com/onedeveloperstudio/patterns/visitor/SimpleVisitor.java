package com.onedeveloperstudio.patterns.visitor;

/**
 * User: y.zakharov
 * Date: 17.07.14
 */
public class SimpleVisitor implements Visitor {
  @Override
  public void visit(RoundHouse house) {
    house.setSpace((int) (Math.PI * house.getRadius()*house.getRadius()));
  }

  @Override
  public void visit(SquareHouse house) {
    house.setSpace(house.getLength()*house.getSize());
  }
}
