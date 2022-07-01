package com.innoq.junit;

import com.innoq.junit.extension.HardcoreExtension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(HardcoreExtension.class)
public class TestsPlayground {

	@Test
	void simpleTest() {
		Assertions.assertTrue(true);
	}
}
