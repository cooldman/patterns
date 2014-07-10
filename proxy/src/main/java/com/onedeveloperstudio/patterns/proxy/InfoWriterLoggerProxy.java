package com.onedeveloperstudio.patterns.proxy;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * User: y.zakharov
 * Date: 10.07.14
 */
public class InfoWriterLoggerProxy implements InfoWriter {
  private Logger logger;
  private InfoWriter writer;

  public InfoWriterLoggerProxy() {
    writer = new InfoWriterImpl();
    logger = Logger.getLogger("mainLogger");
  }

  @Override
  public void write() {
    logger.log(Level.INFO, "BEGIN WRITE");
    writer.write();
    logger.log(Level.INFO, "END WRITE");
  }
}
