package com.onedeveloperstudio.patterns.bridge;

/**
 * User: y.zakharov
 * Date: 13.07.14
 */
public abstract class AlarmClock {
  protected AlarmClockImpl bridge;

  public abstract void alarm();

}
