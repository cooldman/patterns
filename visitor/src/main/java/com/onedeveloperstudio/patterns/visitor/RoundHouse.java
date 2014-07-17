package com.onedeveloperstudio.patterns.visitor;

/**
 * User: y.zakharov
 * Date: 17.07.14
 */
public class RoundHouse extends House {
  private int radius;

  public RoundHouse(int radius) {
    this.radius = radius;
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }
}
