package com.onedeveloperstudio.patters.singleton;

/**
 * User: y.zakharov
 * Date: 13.07.14
 */
public class SimpleSingleton {
  private static SimpleSingleton object;

  private SimpleSingleton(){
    System.out.println("Inizialization of singleton");
  }

  public static SimpleSingleton getInstance(){
    if(object == null){
      object = new SimpleSingleton();
    }
    return object;
  }
}
