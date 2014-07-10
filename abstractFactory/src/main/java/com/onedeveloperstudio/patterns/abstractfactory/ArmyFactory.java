package com.onedeveloperstudio.patterns.abstractfactory;

/**
 * User: y.zakharov
 * Date: 10.07.14
 */
public abstract class ArmyFactory {
  public abstract Horseman createHorseman();
  public abstract Archer createArcher();
  public abstract Shilder createShilder();
}
