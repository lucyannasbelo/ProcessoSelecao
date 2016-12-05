package br.org.sambatech.util;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.org.sambatech.common.WichBrowser;
import br.org.sambatech.common.Constants.*;;

public class Utils 
{
	private static WebDriver m_driver;
	private static final WebDriverWait m_wait;

	static
	{
		m_driver = WichBrowser.getDriver();
		m_wait = new WebDriverWait(m_driver, 30);
	}

	public static void IsVisible(By p_locator) 
	{
		m_wait.until(ExpectedConditions.visibilityOfElementLocated(p_locator));
	}

	public static void IsLocated(By p_locator) 
	{
		m_wait.until(ExpectedConditions.presenceOfElementLocated(p_locator));
	}

	public static void IsClickable(By p_locator) 
	{
		m_wait.until(ExpectedConditions.elementToBeClickable(p_locator));
	}

	public static void Click(By p_locator)
	{
		m_driver.findElement(p_locator).click();
	}

	public static void ClearText (By p_locator)
	{
		m_driver.findElement(p_locator).clear();
	}

	public static void FillOutWithText(By p_locator, String p_text)
	{
		m_driver.findElement(p_locator).sendKeys(p_text);
	}

	public static String GetText(By p_locator)
	{
		return  m_driver.findElement(p_locator).getText();
	}

	public static void SelectCheckOrRadio(By p_locator)
	{
		if(!m_driver.findElement(p_locator).isSelected())
		{
			Click(p_locator);
			m_wait.until(ExpectedConditions.elementSelectionStateToBe(p_locator, true));			
		}
	}

	public static void DeselectCheck(By p_locator)
	{
		if(m_driver.findElement(p_locator).isSelected())
		{
			Click(p_locator);
			m_wait.until(ExpectedConditions.elementSelectionStateToBe(p_locator, false));
		}
	}

	public static void SelectCheckOrRadioList(By p_locator, String p_options)
	{
		List<WebElement> v_options = m_driver.findElements(p_locator);

		for (WebElement v_webElement : v_options) {
			if(v_webElement.getText().equals(v_options) & !v_webElement.isSelected())
			{
				v_webElement.click();
				m_wait.until(ExpectedConditions.elementSelectionStateToBe(v_webElement, true));
			}
		}
	}

	public static void DeselectCheckList(By p_locator, String p_options)
	{
		List<WebElement> v_options = m_driver.findElements(p_locator);

		for (WebElement v_webElement : v_options) {
			if(v_webElement.getText().equals(v_options) & v_webElement.isSelected())
			{
				v_webElement.click();
				m_wait.until(ExpectedConditions.elementSelectionStateToBe(v_webElement, false));
			}
		}
	}

	/**
	 * Seleciona pelo valor cadastrado do elemento no dropdown
	 * @param p_locator o dropdown na tela
	 * @param p_Option o valor que quer selecionar no dropdown de acordo com o texto cadastrado
	 */
	public static void SelectOptionDropdownWithText(By p_locator, String p_Option)
	{
		IsClickable(p_locator);
		Select v_combo_list = new Select(m_driver.findElement(p_locator));
		v_combo_list.selectByVisibleText(p_Option);
	}

	/**
	 * Seleciona pela posicao do elemento no dropdown
	 * @param p_locator o dropdown na tela
	 * @param p_Option a posicao do valor que quer selecionar no dropdown
	 */
	public static void SelectOptionDropdownWithIndex(By p_locator, int p_Option)
	{
		IsClickable(p_locator);
		Select v_combo_list = new Select(m_driver.findElement(p_locator));
		v_combo_list.selectByIndex(p_Option);
	}

	/**
	 * Seleciona pelo código do elemento no dropdown
	 * @param p_locator o dropdown na tela
	 * @param p_Option o value do HTML do que quer selecionar no dropdown
	 */
	public static void SelectOptionDropdownWithByValue(By p_locator, String p_value)
	{
		IsClickable(p_locator);
		Select v_combo_list = new Select(m_driver.findElement(p_locator));
		v_combo_list.selectByValue(p_value);
	}

	public static List<WebElement> ReturnListElements(By p_locator) {
		IsClickable(p_locator);
		List<WebElement> v_elements = m_driver.findElements(p_locator);
		return v_elements;
	}

	public static void UploadFile(By p_locatorUpload, String p_path)
	{
		IsClickable(p_locatorUpload);
		m_driver.findElement(p_locatorUpload).sendKeys(p_path);		
	}


	/**
	 * @param text: Texto que ira aparecer caso a mensagem nao seja compatível com a da acao
	 * @param locator: locator da caixa que possui a mensagem
	 * @param msg: a mensagem que deve aparece
	 */
	public static void CompareLocatorTextWithMsg(String p_msg, By p_locator, String p_text)	{
		IsLocated(p_locator);
		assertThat(p_msg, GetText(p_locator), is(p_text)); 		
	}

	/**
	 * @param text: Texto que ira aparecer caso a mensagem nao seja compatível com a da acao
	 * @param locator: locator da caixa que possui a mensagem
	 * @param msg: a mensagem que deve aparece
	 */
	public static void CompareLocatorContainTextWithMsg(String p_msg, By p_locator, String p_text)	{
		IsLocated(p_locator);
		assertTrue(p_msg, GetText(p_locator).contains(p_text)); 
	}

	public static void MouseOver(By p_locator, By p_locator2)
	{
		Actions acao = new Actions(m_driver);
		m_wait.until(ExpectedConditions.visibilityOfElementLocated(p_locator));
		WebElement menuMouseOver = m_driver.findElement(p_locator);
		acao.moveToElement(menuMouseOver).build().perform();
		IsClickableAndClick(p_locator2);
	}

	public static void TakeScreenshot(String p_fileName){
		File v_scrFile = ((TakesScreenshot)m_driver).getScreenshotAs(OutputType.FILE);
		Date data = new Date();
		try {
			FileUtils.copyFile(v_scrFile, new File(ConstantsPath.SCREENSHOT+p_fileName+ data.getTime()+ConstantsExtension.JPEG),true);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println (e.toString());
		}
	}

	public static void SelectCtrlPlusS(By p_locator)
	{
		Wait();
		m_driver.findElement(p_locator).sendKeys(Keys.chord(Keys.CONTROL, "s")); 
	}

	//// juncoes

	public static void ClearAndFillOut(By p_locator, String p_text){
		ClearText(p_locator);
		FillOutWithText(p_locator, p_text);
	}

	public static void IsClickableAndClick(By p_locator){
		IsClickable(p_locator);
		Click(p_locator);
	}

	public static void IsClickableClearAndFillOut(By p_locator, String p_text)
	{
		IsClickable(p_locator);
		ClearAndFillOut(p_locator, p_text);
	}

	public static void IsClickableAndSelectOptionWithText(By p_locator, String p_Option)
	{
		IsVisible(p_locator);
		IsClickable(p_locator);
		SelectOptionDropdownWithText(p_locator, p_Option);
	}

	public static void IsClickableAndSelectOption(By p_locator, int p_Option)
	{
		IsClickable(p_locator);
		SelectOptionDropdownWithIndex(p_locator, p_Option);
	}

	public static void IsClickableAndSelectOptionWithValue(By p_locator, String p_Option)
	{
		IsVisible(p_locator);
		IsClickable(p_locator);
		SelectOptionDropdownWithByValue(p_locator, p_Option);
	}

	public static void IsClickableAndSelectCheckOrRadio(By p_locator)
	{
		IsClickable(p_locator);
		SelectCheckOrRadio(p_locator);
	}

	public static void IsClickableAndDeselectCheckOrRadio(By p_locator)
	{
		IsClickable(p_locator);
		DeselectCheck(p_locator);
	}

	///////////////Pages

	public static void AcessOtherPage(String p_path, String p_numberPage)
	{
		m_driver.get(p_path.concat(p_numberPage));
	}

	public static void AcessPage(String p_path)
	{
		m_driver.get(p_path);
		Wait();
	}

	public static void BackPage()
	{
		m_driver.navigate().back();
	}

	public static void Wait()
	{
		m_driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
	}

	public static String GetURL()
	{
		return m_driver.getCurrentUrl();
	}
	////////
}
