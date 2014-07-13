package com.onedeveloperstudio.patters.singleton;

/**
 * User: y.zakharov
 * Date: 13.07.14
 */
public class SingletonOnDemandHolder {
  private static SingletonOnDemandHolder instance;

  public static class SingletonHolder {
    public static final SingletonOnDemandHolder HOLDER_INSTANCE = new SingletonOnDemandHolder();
  }

  public static SingletonOnDemandHolder getInstance() {
    return SingletonHolder.HOLDER_INSTANCE;
  }
}
