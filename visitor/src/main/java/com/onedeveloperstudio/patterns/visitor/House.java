package com.onedeveloperstudio.patterns.visitor;

/**
 * User: y.zakharov
 * Date: 17.07.14
 */
public abstract class House {
  public abstract void accept(Visitor v);
  private int space;

  public int getSpace() {
    return space;
  }

  public void setSpace(int space) {
    this.space = space;
  }
}
