package com.programme;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skipexception {
	@Test
	public void test1() {
		System.out.println("for test1");
	}

	@Test
	public void test2() {
		System.out.println("for test2");
	}

	@Test
	public void test3() {
		throw new SkipException("for some reason");
	}
}