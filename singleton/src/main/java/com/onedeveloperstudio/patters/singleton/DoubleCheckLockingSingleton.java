package com.onedeveloperstudio.patters.singleton;

/**
 * User: y.zakharov
 * Date: 13.07.14
 */
public class DoubleCheckLockingSingleton {
  private static volatile DoubleCheckLockingSingleton instance;

  private DoubleCheckLockingSingleton(){
    System.out.println("inizialization of DoubleCheckLockingSingleton");
  }

  public static DoubleCheckLockingSingleton getInstace(){
    if(instance == null){
      synchronized (DoubleCheckLockingSingleton.class){
        if(instance == null){
          instance = new DoubleCheckLockingSingleton();
        }
      }
    }
    return instance;
  }
}
