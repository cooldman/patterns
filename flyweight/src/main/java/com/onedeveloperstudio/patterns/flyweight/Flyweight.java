package com.onedeveloperstudio.patterns.flyweight;

/**
 * User: y.zakharov
 * Date: 06.08.14
 */
public abstract class Flyweight {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  protected abstract void writeName();
}
