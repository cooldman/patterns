package com.onedeveloperstudio.patterns.builder;

/**
 * User: y.zakharov
 * Date: 14.07.14
 */
public abstract class HouseBuilder {
  protected House house;

  public House getHouse(){
    return house;
  }

  public void prepateHouseForBuild(){
    house = new House();
  }

  public abstract void buildDoor();
  public abstract void buildFloor();
  public abstract void buildWindow();
}
