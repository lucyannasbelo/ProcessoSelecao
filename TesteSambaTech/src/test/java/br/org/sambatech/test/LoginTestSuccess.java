package br.org.sambatech.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.TimeoutException;

import br.org.sambatech.common.Constants.ConstantsInformationLogin;
import br.org.sambatech.pages.*;

public class LoginTestSuccess
{
	@Before
	public void before() throws Exception {  

	}	

	@Test
	public void Login(){
		try{
			LoginPage.Login(ConstantsInformationLogin.EMAIL, ConstantsInformationLogin.PASSWORD);		
		}catch(TimeoutException t){
			System.out.println (t.toString());
			Assert.fail();		
		}
	}

	@After
	public void after() throws Exception {
	}
}