package com.onedeveloperstudio.patterns.visitor;

/**
 * User: y.zakharov
 * Date: 17.07.14
 */
public interface Visitor {
  public void visit(RoundHouse house);
  public void visit(SquareHouse house);
}
