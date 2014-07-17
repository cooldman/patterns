package com.onedeveloperstudio.patterns.visitor;

/**
 * User: y.zakharov
 * Date: 17.07.14
 */
public class SquareHouse extends House {
  private int length;
  private int size;

  public SquareHouse(int length, int size) {
    this.length = length;
    this.size = size;
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }
}
