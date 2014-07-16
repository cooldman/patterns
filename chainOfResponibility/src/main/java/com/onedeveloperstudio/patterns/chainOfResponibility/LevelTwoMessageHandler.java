package com.onedeveloperstudio.patterns.chainOfResponibility;

/**
 * User: y.zakharov
 * Date: 15.07.14
 */
public class LevelTwoMessageHandler extends MessageHandler {
  protected LevelTwoMessageHandler() {
    super(MESSAGE_LEVEL.LEVEL_2);
  }

  @Override
  public void messageHandle(String msg) {
    System.out.println("LEVEL 2:" + msg);
  }
}
