package com.onedeveloperstudio.patterns.observer;

/**
 * User: y.zakharov
 * Date: 12.07.14
 */
public class LightObserver implements Observer {
  @Override
  public void updateState(State state) {
    switch (state) {
      case EMPTY: {
        System.out.println("SET THE LIGHT OFF");
        break;
      }
      case FULL: {
        System.out.println("SET THE LIGHT ON");
        break;
      }
      default:
        throw new RuntimeException("Wrong state");
    }
    System.out.println("Observable object change his state to " + state);
  }
}
