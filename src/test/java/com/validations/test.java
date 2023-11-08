package com.validations;


import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
	
	@Test
	public void test1()
	{
		AgeValidation l = new AgeValidation();
		Assert.assertEquals("Valid age and not eligible for vote", l.validateAge(5));
	}
	
	
	@Test
	public void test2()
	{
		AgeValidation l = new AgeValidation();
		Assert.assertEquals("Valid age and eligible for vote", l.validateAge(19));
		
	}
	
	@Test
	public void test3()
	{
		AgeValidation l = new AgeValidation();
		Assert.assertEquals("Not an valid age", l.validateAge(-5));
		
	}
	
	@Test
	public void test4()
	{
		AgeValidation l = new AgeValidation();
		Assert.assertEquals(5, l.arthematicOperations(2, 3, "+"));
		
	}
	
	@Test
	public void test5()
	{
		AgeValidation l = new AgeValidation();
		Assert.assertEquals(5, l.arthematicOperations(-2, -3, "+"));
		
	}
	
	@Test
	public void test6()
	{
		AgeValidation l = new AgeValidation();
		Assert.assertEquals(-6, l.arthematicOperations(2, -3, "*"));
		
	}
	
	@Test
	public void test7()
	{
		AgeValidation l = new AgeValidation();
		Assert.assertEquals(6, l.arthematicOperations(-2, -3, "*"));
		
	}
}