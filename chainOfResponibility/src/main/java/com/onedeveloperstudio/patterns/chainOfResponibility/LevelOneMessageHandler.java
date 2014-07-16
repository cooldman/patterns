package com.onedeveloperstudio.patterns.chainOfResponibility;

/**
 * User: y.zakharov
 * Date: 15.07.14
 */
public class LevelOneMessageHandler extends MessageHandler {
  protected LevelOneMessageHandler() {
    super(MESSAGE_LEVEL.LELEL_1);
  }

  @Override
  public void messageHandle(String msg) {
    System.out.println("LEVEL 1:" + msg);
  }
}
