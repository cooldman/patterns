package com.onedeveloperstudio.patterns.proxy;

/**
 * User: y.zakharov
 * Date: 10.07.14
 */
public class Main {
  public static void main(String... args){
    InfoWriter writer = new InfoWriterLoggerProxy();
    writer.write();
  }
}
