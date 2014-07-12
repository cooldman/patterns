package com.onedeveloperstudio.patterns.observer;

/**
 * User: y.zakharov
 * Date: 12.07.14
 */
public interface Observable {
  public void registerObserver(Observer observer);
  public void removeObserver(Observer observer);
  public void notifyObservers(State newState);
}
