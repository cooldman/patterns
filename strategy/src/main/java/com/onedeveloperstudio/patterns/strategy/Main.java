package com.onedeveloperstudio.patterns.strategy;

/**
 * User: y.zakharov
 * Date: 16.07.14
 */
public class Main {
  public static void main(String... args){
    Context c = new Context();
    c.setStrategy(new MultiplyStrategy());
    System.out.println(c.executeStrategy(1, 5));
    c.setStrategy(new AddStrategy());
    System.out.println(c.executeStrategy(1, 5));
  }
}
