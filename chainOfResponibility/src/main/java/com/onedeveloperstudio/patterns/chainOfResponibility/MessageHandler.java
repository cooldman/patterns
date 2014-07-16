package com.onedeveloperstudio.patterns.chainOfResponibility;

/**
 * User: y.zakharov
 * Date: 15.07.14
 */
public abstract class MessageHandler {
  private MessageHandler nextInChain;
  private MESSAGE_LEVEL currentHandlerLevel;

  protected MessageHandler(MESSAGE_LEVEL currentHandlerLevel) {
    this.currentHandlerLevel = currentHandlerLevel;
  }

  public static enum MESSAGE_LEVEL {
    LELEL_1(1),
    LEVEL_2(2),
    LEVEL_3(3);

    public int level;

    private MESSAGE_LEVEL(int level) {
      this.level = level;
    }

    public int getLevel() {
      return level;
    }
  }

  public MessageHandler setNextHandler(MessageHandler handler){
    nextInChain = handler;
    return handler;
  }

  public void handleMessage(String msg, MESSAGE_LEVEL messageLevel){
    if(currentHandlerLevel.getLevel() <= messageLevel.getLevel()){
      messageHandle(msg);
    }
    if(nextInChain !=null){
      nextInChain.handleMessage(msg, messageLevel);
    }
  }

  public abstract void messageHandle(String msg);
}
