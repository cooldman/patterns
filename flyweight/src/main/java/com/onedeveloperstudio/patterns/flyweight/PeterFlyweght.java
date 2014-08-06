package com.onedeveloperstudio.patterns.flyweight;

/**
 * User: y.zakharov
 * Date: 06.08.14
 */
public class PeterFlyweght extends Flyweight{

  public PeterFlyweght() {
    setName("Peter");
  }

  @Override
  protected void writeName() {
    System.out.println(getName());
  }
}
