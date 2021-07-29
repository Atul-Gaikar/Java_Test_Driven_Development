package com.bridgelabz.javatddtest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.javatdd.PasswordValidator;

public class TestPassword {
	@Test
	public void TestPasswordLength() {
		PasswordValidator pv = new PasswordValidator();
		Assert.assertEquals(true, pv.isValid("Sai123"));
	}
}
