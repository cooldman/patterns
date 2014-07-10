package com.onedeveloperstudio.patterns.abstractfactory;

/**
 * User: y.zakharov
 * Date: 10.07.14
 */
public class RomeArmyFactory extends ArmyFactory {
  @Override
  public Horseman createHorseman() {
    return new RomeHorseman();
  }

  @Override
  public Archer createArcher() {
    return new RomeArcher();  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public Shilder createShilder() {
    return new RomeShilder();  //To change body of implemented methods use File | Settings | File Templates.
  }
}
