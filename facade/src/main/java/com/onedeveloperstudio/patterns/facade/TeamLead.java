package com.onedeveloperstudio.patterns.facade;

/**
 * User: y.zakharov
 * Date: 04.08.14
 */
public class TeamLead {
  private Designer designer;
  private Developer developer;
  private Tester tester;

  public void develop(){
    developer.develop();
  }

  public  void design(){
    designer.design();
  }

  public void test(){
    tester.test();
  }
}
