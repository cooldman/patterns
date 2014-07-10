package com.onedeveloperstudio.patterns.abstractfactory;

import java.util.List;

/**
 * User: y.zakharov
 * Date: 10.07.14
 */
public class Army {

  public Army(String country) {
    this.country = country;
  }

  private String country;
  private List<Archer> archers;
  private List<Horseman> horsemans;
  private List<Shilder> shilders;

  public List<Archer> getArchers() {
    return archers;
  }

  public void setArchers(List<Archer> archers) {
    this.archers = archers;
  }

  public List<Horseman> getHorsemans() {
    return horsemans;
  }

  public void setHorsemans(List<Horseman> horsemans) {
    this.horsemans = horsemans;
  }

  public List<Shilder> getShilders() {
    return shilders;
  }

  public void setShilders(List<Shilder> shilders) {
    this.shilders = shilders;
  }

  public void info(){
    System.out.println(country);
    for(Archer a : archers){
      a.info();
    }
    for(Horseman h : horsemans){
      h.info();
    }
    for(Shilder s : shilders){
      s.info();
    }
  }
}
