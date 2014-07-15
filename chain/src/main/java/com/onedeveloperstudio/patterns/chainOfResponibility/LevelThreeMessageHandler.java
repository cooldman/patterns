package com.onedeveloperstudio.patterns.chainOfResponibility;

/**
 * User: y.zakharov
 * Date: 15.07.14
 */
public class LevelThreeMessageHandler extends MessageHandler {
  protected LevelThreeMessageHandler() {
    super(MESSAGE_LEVEL.LEVEL_3);
  }

  @Override
  public void messageHandle(String msg) {
    System.out.println("LEVEL 3:" + msg);
  }
}
