package com.onedeveloperstudio.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * User: y.zakharov
 * Date: 12.07.14
 */
public class EnterObserveable implements Observable {
  private List<Observer> observers;
  private State currentState;

  public EnterObserveable() {
    this.observers = new ArrayList<>();
    this.currentState = State.EMPTY;
    notifyObservers(currentState);
  }

  @Override
  public void registerObserver(Observer observer) {
   observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers(State newState) {
    for(Observer obs : observers){
      obs.updateState(newState);
    }
  }
}
