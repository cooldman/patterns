package com.onedeveloperstudio.patterns.flyweight;

/**
 * User: y.zakharov
 * Date: 06.08.14
 */
public class StewartFlyweight extends Flyweight{

  public StewartFlyweight() {
    setName("stewart");
  }

  @Override
  protected void writeName() {
    System.out.println(getName());
  }
}
