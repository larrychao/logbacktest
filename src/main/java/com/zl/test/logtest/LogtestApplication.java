package com.zl.test.logtest;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogtestApplication {

	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(LogtestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LogtestApplication.class, args);
		logger.info("logger success");
		logger.warn("logger warrning");
		logger.error("log error");
		logger.debug("log debug");
	}
}
