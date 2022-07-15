package com.innoq.junit.extension;

import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.engine.reporting.ReportEntry;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.TestPlan;

public class HardcoreTestExecutionListener implements TestExecutionListener {

	private static final Logger logger = LoggerFactory.getLogger(HardcoreTestExecutionListener.class);

	@Override
	public void testPlanExecutionStarted(TestPlan testPlan) {
		logger.info(() -> "testPlanExecutionStarted");
	}

	@Override
	public void testPlanExecutionFinished(TestPlan testPlan) {
//		logger.info(() -> "testPlanExecutionFinished");
	}

	@Override
	public void dynamicTestRegistered(TestIdentifier testIdentifier) {
//		logger.info(() -> "dynamicTestRegistered");
	}

	@Override
	public void executionSkipped(TestIdentifier testIdentifier, String reason) {
//		logger.info(() -> "executionSkipped");
	}

	@Override
	public void executionStarted(TestIdentifier testIdentifier) {
		logger.info(() -> "executionStarted, testId: " + testIdentifier.getUniqueId());
	}

	@Override
	public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult testExecutionResult) {
//		logger.info(() -> "executionFinished");
	}

	@Override
	public void reportingEntryPublished(TestIdentifier testIdentifier, ReportEntry entry) {
//		logger.info(() -> "reportingEntryPublished");
	}
}
