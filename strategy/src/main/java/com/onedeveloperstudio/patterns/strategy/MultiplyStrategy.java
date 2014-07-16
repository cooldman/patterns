package com.onedeveloperstudio.patterns.strategy;

/**
 * User: y.zakharov
 * Date: 16.07.14
 */
public class MultiplyStrategy implements Strategy {
  @Override
  public int execute(int a, int b) {
    return a*b;
  }
}
