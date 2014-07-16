package com.onedeveloperstudio.patterns.templateMethod;

/**
 * User: y.zakharov
 * Date: 16.07.14
 */
public class ClassWithTemplateMethodExt2 extends ClassWithTemplateMethod {
  @Override
  public void method1() {
    System.out.println("2:1");
  }

  @Override
  public void method2() {
    System.out.println("2:2");
  }

  @Override
  public void method3() {
    System.out.println("2:3");
  }
}
