package com.onedeveloperstudio.patterns.proxy;

/**
 * User: y.zakharov
 * Date: 10.07.14
 */
public class InfoWriterImpl implements InfoWriter {
  @Override
  public void write() {
    System.out.println("=========== YEAH ================");
  }
}
