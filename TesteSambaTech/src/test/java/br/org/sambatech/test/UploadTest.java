package br.org.sambatech.test;



import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.TimeoutException;

import br.org.sambatech.pages.UploadPage;

public class UploadTest {

	@Test
	public void UploadFileWith2GB() 
	{
		try
		{
			UploadPage.UploadFile("videoTest.avi");
		}catch(TimeoutException t){
			System.out.println (t.toString());
			Assert.fail();		
		}
	}

}
