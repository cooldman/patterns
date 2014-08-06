package com.onedeveloperstudio.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * User: y.zakharov
 * Date: 06.08.14
 */
public class FlyweightFactory {
  private Map<String, Flyweight> map = new HashMap();

  public Flyweight getFlyweight(String name) {
    Flyweight weight = map.get(name);
    if (weight == null) {
      switch (name) {
        case "Peter": {
          weight = new PeterFlyweght();
          break;
        }
        case "Stewart": {
          weight = new StewartFlyweight();
          break;
        }
      }
    }
    return weight;
  }
}
