package com.onedeveloperstudio.patterns.proxy;

/**
 * User: y.zakharov
 * Date: 10.07.14
 */
public class InfoWriterProtectionProxy implements InfoWriter {
  private InfoWriter writer;

  public InfoWriterProtectionProxy() {
    writer = new InfoWriterImpl();
  }

  private boolean checkRights() {
    return true;
  }

  @Override
  public void write() {
    if (checkRights()) {
      writer.write();
    } else {
      System.out.println("You havn't got access for this action");
    }
  }
}
