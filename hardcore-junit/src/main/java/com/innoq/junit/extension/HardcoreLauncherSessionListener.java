package com.innoq.junit.extension;

import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.platform.launcher.LauncherSession;
import org.junit.platform.launcher.LauncherSessionListener;

public class HardcoreLauncherSessionListener implements LauncherSessionListener {

	private static final Logger logger = LoggerFactory.getLogger(HardcoreLauncherSessionListener.class);

	@Override
	public void launcherSessionOpened(LauncherSession session) {
		logger.info(() -> "launcherSessionOpened");
		System.setProperty("junit.jupiter.testmethod.order.default", "org.junit.jupiter.api.MethodOrderer$Random");
	}

	@Override
	public void launcherSessionClosed(LauncherSession session) {
		logger.info(() -> "launcherSessionClosed");
	}
}
