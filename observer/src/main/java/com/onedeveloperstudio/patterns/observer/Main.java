package com.onedeveloperstudio.patterns.observer;

/**
 * User: y.zakharov
 * Date: 12.07.14
 */
public class Main {
  public static void main(String... args){
    LightObserver lampa = new LightObserver();
    EnterObserveable enterObserveable = new EnterObserveable();
    enterObserveable.registerObserver(lampa);
    enterObserveable.notifyObservers(State.FULL);
  }
}
