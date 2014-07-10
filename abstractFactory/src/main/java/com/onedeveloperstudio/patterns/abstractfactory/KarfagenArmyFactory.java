package com.onedeveloperstudio.patterns.abstractfactory;

/**
 * User: y.zakharov
 * Date: 10.07.14
 */
public class KarfagenArmyFactory extends ArmyFactory{
  @Override
  public Horseman createHorseman() {
    return new KarfagenHorseman();  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public Archer createArcher() {
    return new KarfagenArcher();  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public Shilder createShilder() {
    return new KarfagenShilder();  //To change body of implemented methods use File | Settings | File Templates.
  }
}
