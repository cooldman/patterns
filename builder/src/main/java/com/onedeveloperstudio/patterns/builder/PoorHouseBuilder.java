package com.onedeveloperstudio.patterns.builder;

/**
 * User: y.zakharov
 * Date: 14.07.14
 */
public class PoorHouseBuilder extends HouseBuilder {
  @Override
  public void buildDoor() {
    house.setDoor("Poor door");
  }

  @Override
  public void buildFloor() {
    house.setWindow("Poor window");
  }

  @Override
  public void buildWindow() {
    house.setFloor("Poor floor");
  }
}
