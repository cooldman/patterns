package com.onedeveloperstudio.patterns.builder;

/**
 * User: y.zakharov
 * Date: 14.07.14
 */
public class Director {
  private HouseBuilder builder;

  public HouseBuilder getBuilder() {
    return builder;
  }

  public void setBuilder(HouseBuilder builder) {
    this.builder = builder;
  }

  public House getHouse(){
    return builder.getHouse();
  }

  public void constructHouse(){
    builder.prepateHouseForBuild();
    builder.buildDoor();
    builder.buildFloor();
    builder.buildWindow();
  }
}
