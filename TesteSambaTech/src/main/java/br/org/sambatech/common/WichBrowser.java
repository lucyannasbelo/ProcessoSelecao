package br.org.sambatech.common;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Identifica qual o browser escolhido no config.properties e inicializa o webdriver correspondente
 */
public class WichBrowser 
{
private static WebDriver driver = null;	
	/**
	 * Verifica qual o browser escolhido no arquivo de propriedades
	 * inicializa o driver apropriado e o retorna
	 * @return retorna instância do WebDriver
	 */
	public static WebDriver getDriver() {
		String browser = Property.BROWSER_NAME;
		if (driver == null) {
			if (Constants.ConstantsBrowser.CHROME.equals(browser)) {
				File file = new File(Property.CHROME_DRIVE_PATH);
				System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
				driver = new ChromeDriver();
			} else if (Constants.ConstantsBrowser.IE.equals(browser)) {
				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				File file = new File(Property.IE64_DRIVE_PATH);
				
				System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
				driver = new InternetExplorerDriver(capabilities);
			} else if (Constants.ConstantsBrowser.FIREFOX.equals(browser))
			{
				File file = new File(Property.FIREFOX_DRIVE_PATH);
				System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
				driver = new FirefoxDriver();
			}
		}
		return driver;
	}	
}
