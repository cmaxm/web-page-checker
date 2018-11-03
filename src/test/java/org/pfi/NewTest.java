package org.pfi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {

	final Logger logger = LoggerFactory.getLogger(NewTest.class);

	@Test
	public void f() {
		logger.info("test");
		Assert.assertEquals(1, 1);
	}
}
