package com.programme;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
	@Test
	public void test1() {
		Assert.assertTrue(true);
	}

	@Test
	public void test2() {
		Assert.assertTrue(false);
	}
}
