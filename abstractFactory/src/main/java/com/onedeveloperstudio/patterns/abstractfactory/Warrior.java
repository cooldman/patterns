package com.onedeveloperstudio.patterns.abstractfactory;

/**
 * User: y.zakharov
 * Date: 10.07.14
 */
public class Warrior {

  private String name;

  public Warrior(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void info(){
    System.out.println(name);
  }
}
