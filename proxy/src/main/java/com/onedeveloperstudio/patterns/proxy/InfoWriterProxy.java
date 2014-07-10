package com.onedeveloperstudio.patterns.proxy;

/**
 * User: y.zakharov
 * Date: 10.07.14
 */
public class InfoWriterProxy implements InfoWriter {
  private InfoWriter infoWriter;

  public InfoWriterProxy() {
    this.infoWriter =  new InfoWriterImpl();
  }

  @Override
  public void write() {
    infoWriter.write();
  }
}
