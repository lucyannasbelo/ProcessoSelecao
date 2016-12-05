package br.org.sambatech.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.TimeoutException;

import br.org.sambatech.pages.HeaderNavBar;

public class HeaderTest 
{

	@Test
	public void AccessUserSettings() {
		try{
			HeaderNavBar.AccessUserSettings();
		}catch(TimeoutException t){
			System.out.println (t.toString());
			Assert.fail();		
		}
	}
	
	@Test
	public void AccessManageProject() {
		try{
			HeaderNavBar.AccessManageProject();
		}catch(TimeoutException t){
			System.out.println (t.toString());
			Assert.fail();		
		}
	}

}
