package br.org.sambatech.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.TimeoutException;

import br.org.sambatech.common.Constants.ConstantsInformationLogin;
import br.org.sambatech.pages.LoginPage;

public class LoginTestFail
{
	@Before
	public void before() throws Exception {  

	}	

	@Test
	public void LoginWithOnlyEmail(){
		try{
			LoginPage.Login(ConstantsInformationLogin.EMAIL, "");		
			LoginPage.CheckMessageError();
		}catch(TimeoutException t){
			System.out.println (t.toString());
			Assert.fail();		
		}
	}
	
	@Test
	public void LoginWithOnlyPassword(){
		try{
			LoginPage.Login("", ConstantsInformationLogin.PASSWORD);	
			LoginPage.CheckMessageError();
		}catch(TimeoutException t){
			System.out.println (t.toString());
			Assert.fail();		
		}
	}
	
	@Test
	public void LoginNoEmailAndNoPassword(){
		try{
			LoginPage.Login("", "");	
			LoginPage.CheckMessageError();
		}catch(TimeoutException t){
			System.out.println (t.toString());
			Assert.fail();		
		}
	}

	@After
	public void after() throws Exception {
	}
}