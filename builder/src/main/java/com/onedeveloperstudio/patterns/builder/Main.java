package com.onedeveloperstudio.patterns.builder;

/**
 * User: y.zakharov
 * Date: 14.07.14
 */
public class Main {
  public static void main(String... args){
    Director director = new Director();
    director.setBuilder(new PoorHouseBuilder());
    director.constructHouse();
    House house = director.getHouse();
    int i = 10;
  }
}
