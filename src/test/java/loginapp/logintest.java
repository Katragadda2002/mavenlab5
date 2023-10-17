package loginapp;

import org.testng.Assert;

import org.testng.annotations.Test;

public class logintest {
	@Test
	public void test1()
	{
		loginapp l = new loginapp();
		Assert.assertEquals(0,l.checkLogin("xyz","123@xyz"));
	}
	@Test
	public void test2()
	{
		loginapp l = new loginapp();
		Assert.assertEquals(1,l.checkLogin("xyz","123xyz"));
	}

}
