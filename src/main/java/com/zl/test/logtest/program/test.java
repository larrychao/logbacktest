package com.zl.test.logtest.program;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class test {
  private final static org.slf4j.Logger logger = LoggerFactory.getLogger(test.class);
  public test(){
    logger.info("program test info log");
    logger.warn("program test warn log");
    logger.error("program test error log");
  }
}
