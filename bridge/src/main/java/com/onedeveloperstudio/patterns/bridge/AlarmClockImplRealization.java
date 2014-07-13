package com.onedeveloperstudio.patterns.bridge;

/**
 * User: y.zakharov
 * Date: 13.07.14
 */
public class AlarmClockImplRealization extends AlarmClockImpl {

  @Override
  public void ring() {
    System.out.println("RING");
  }
}
