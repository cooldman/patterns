package com.onedeveloperstudio.patterns.strategy;

/**
 * User: y.zakharov
 * Date: 16.07.14
 */
public class Context {
  private Strategy strategy;

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public int executeStrategy(int a, int b){
    return strategy.execute(a, b);
  }
}
