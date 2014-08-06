package com.onedeveloperstudio.patterns.flyweight;

/**
 * User: y.zakharov
 * Date: 06.08.14
 */
public class Main {
  public static void main(String... args){
    FlyweightFactory factory = new FlyweightFactory();
    String[] array = {"Peter", "Stewart"};
    for(String s : array){
      factory.getFlyweight(s).writeName();
    }
  }
}
