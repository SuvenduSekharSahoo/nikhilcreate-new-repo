package samplemavenprojecr;

import org.testng.annotations.Test;

public class Byyyyy 
{
	@Test(groups = "smoke")
	public void hellodeepa()
	{
		System.out.println("how are you222222");
	}
	@Test(groups = "regration")
	public void haveyou()
	{
		System.out.println("have coffee2222");
	}
	@Test
	public void haveyou1()
	{
		String browser=System.getProperty("Browser");
		String url=System.getProperty("url");
	}
}
