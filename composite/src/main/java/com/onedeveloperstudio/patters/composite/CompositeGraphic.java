package com.onedeveloperstudio.patters.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * User: y.zakharov
 * Date: 24.07.14
 */
public class CompositeGraphic implements Graphic {
  private List<Graphic> list = new ArrayList<>();

  @Override
  public void print() {
    for(Graphic g : list){
      g.print();
    }
  }

  public void add(Graphic g){
    list.add(g);
  }

  public void remove(Graphic g){
    list.remove(g);
  }
}
