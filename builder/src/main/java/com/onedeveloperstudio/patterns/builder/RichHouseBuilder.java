package com.onedeveloperstudio.patterns.builder;

/**
 * User: y.zakharov
 * Date: 14.07.14
 */
public class RichHouseBuilder extends HouseBuilder {
  @Override
  public void buildDoor() {
    house.setDoor("Rich door");
  }

  @Override
  public void buildFloor() {
    house.setFloor("Rich floor");
  }

  @Override
  public void buildWindow() {
    house.setWindow("Rich window");
  }
}
