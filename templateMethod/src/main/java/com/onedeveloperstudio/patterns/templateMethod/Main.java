package com.onedeveloperstudio.patterns.templateMethod;

/**
 * User: y.zakharov
 * Date: 16.07.14
 */
public class Main {
  public static void main(String... args){
    ClassWithTemplateMethod cl = new ClassWithTemplateMethodExt1();
    cl.templateMethod();
    cl = new ClassWithTemplateMethodExt2();
    cl.templateMethod();
  }
}
