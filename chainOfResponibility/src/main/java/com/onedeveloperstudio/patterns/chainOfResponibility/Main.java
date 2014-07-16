package com.onedeveloperstudio.patterns.chainOfResponibility;

/**
 * User: y.zakharov
 * Date: 15.07.14
 */
public class Main {
  public static void main(String... args){
    MessageHandler handler1 = new LevelOneMessageHandler();
    MessageHandler handler2 = new LevelTwoMessageHandler();
    MessageHandler handler3 = new LevelThreeMessageHandler();
    handler1.setNextHandler(handler2);
    handler2.setNextHandler(handler3);

    handler1.handleMessage("MESSAGE LVL1", MessageHandler.MESSAGE_LEVEL.LELEL_1);
    handler1.handleMessage("MESSAGE LVL2", MessageHandler.MESSAGE_LEVEL.LEVEL_2);
    handler1.handleMessage("MESSAGE LVL3", MessageHandler.MESSAGE_LEVEL.LEVEL_3);
  }
}
