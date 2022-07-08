package com.innoq.junit.extension;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class HardcoreExtension implements BeforeAllCallback {

	private static final Logger logger = LoggerFactory.getLogger(HardcoreExtension.class);

	@Override
	public void beforeAll(ExtensionContext context) {
		logger.info(() -> "Hello World!");
	}
}
