package com.onedeveloperstudio.patterns.abstractfactory;

import java.util.Arrays;
import java.util.List;

/**
 * User: y.zakharov
 * Date: 10.07.14
 */
public class Game {
  private Army army;

  public Army createArmy(ArmyFactory factory, String country){
    army = new Army(country);
    army.setArchers(Arrays.asList(factory.createArcher()));
    army.setHorsemans(Arrays.asList(factory.createHorseman()));
    army.setShilders(Arrays.asList(factory.createShilder()));
    return army;
  }
}
