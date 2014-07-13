package com.onedeveloperstudio.patterns.bridge;

/**
 * User: y.zakharov
 * Date: 13.07.14
 */
public class AlarmClockRealization extends AlarmClock {

  public AlarmClockRealization(AlarmClockImpl alarmClock) {
    bridge = alarmClock;
  }

  @Override
  public void alarm() {
    bridge.ring();
    System.out.println("ALARM");
  }
}
