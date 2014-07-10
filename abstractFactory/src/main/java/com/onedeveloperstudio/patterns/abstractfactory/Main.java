package com.onedeveloperstudio.patterns.abstractfactory;

/**
 * User: y.zakharov
 * Date: 10.07.14
 */
public class Main {
  public static void main(String...args){
    Army romeArmy = new Game().createArmy(new RomeArmyFactory(), "=Rome=");
    romeArmy.info();
    Army karfagenArmy = new Game().createArmy(new KarfagenArmyFactory(), "=Karfagen=");
    karfagenArmy.info();
  }
}
