package br.org.sambatech.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import br.org.sambatech.common.WichBrowser;
import br.org.sambatech.common.Property;

public class BaseTestCase {


	protected static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() throws Exception {	
			driver = WichBrowser.getDriver();
			driver.navigate().to(Property.SITE_ADDRESS);
			driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void afterClass() throws Exception {
	driver.quit();
	}
}

