package com.innoq.junit.extension;

import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.platform.launcher.LauncherSession;
import org.junit.platform.launcher.LauncherSessionListener;

import java.util.Random;

public class HardcoreLauncherSessionListener implements LauncherSessionListener {

	private static final Logger logger = LoggerFactory.getLogger(HardcoreLauncherSessionListener.class);

	@Override
	public void launcherSessionOpened(LauncherSession session) {
//		logger.info(() -> "launcherSessionOpened");
		enforceRandomOrderOfClassesAndMethods();
		enforceParallelTestsExecution();
	}

	private void enforceRandomOrderOfClassesAndMethods() {
		final long seed = new Random().nextLong();	// -5055947326608513959
		logger.debug(() -> "");
		System.setProperty("junit.jupiter.testmethod.order.default", "org.junit.jupiter.api.MethodOrderer$Random");
		System.setProperty("junit.jupiter.testclass.order.default", "org.junit.jupiter.api.ClassOrderer$Random");
		System.setProperty("junit.jupiter.execution.order.random.seed", String.valueOf(seed));
	}

	private void enforceParallelTestsExecution() {
		System.setProperty("junit.jupiter.execution.parallel.enabled", "true");
		System.setProperty("junit.jupiter.execution.parallel.mode.default", "concurrent");
		System.setProperty("junit.jupiter.execution.parallel.mode.classes.default", "concurrent");
	}

//	@Override
//	public void launcherSessionClosed(LauncherSession session) {
//		logger.info(() -> "launcherSessionClosed");
//	}
}
