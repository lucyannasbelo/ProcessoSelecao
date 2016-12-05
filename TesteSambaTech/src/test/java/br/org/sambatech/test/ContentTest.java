package br.org.sambatech.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.TimeoutException;

import br.org.sambatech.pages.ContentPage;

public class ContentTest 
{
	
	@Test
	public void AccessContentPage()
	{
		try{
			ContentPage.AccessContentMenu();	
		}catch(TimeoutException t)
		{
			System.out.println (t.toString());
			Assert.fail();		
		}
	}

}
