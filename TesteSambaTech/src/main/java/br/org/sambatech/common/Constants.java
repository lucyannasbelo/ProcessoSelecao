package br.org.sambatech.common;

import org.openqa.selenium.By;

public abstract class Constants 
{
	public static class ConstantsInformationLogin
	{
		public static final String EMAIL = "avaliacao_qa_samba@sambatech.com.br";
		public static final String PASSWORD = "12345678";
	}

	public static class ConstantsLoginPage
	{
		public static final By TXT_EMAIL = By.id("inputEmail");
		public static final By TXT_PASSWORD = By.id("inputPassword");
		public static final By BTN_LOGIN = By.id("login");
		public static final By CHK_REMEMEBER_ME = By.id("rememeberMe");
		public static final By LNK_FORGOT_PASSWORD = By.id("forgot-pwd-link");
		public static final By LNK_KNOW_SAMBA_VIDEOS = By.id("know-samba");
		public static final By LNK_SUPPORT_CENTRAL = By.id("support-central");
		public static final By LNK_SAMBA_WEBSITE = By.id("sambatech-logo");
		public static final By MSG_INCORRECT_LOGIN_PASSWORD = By.id("password_incorrect");
		public static final String MSG_MSG_INCORRECT_LOGIN_PASSWORD = "Email ou senha incorretos. Saiba Mais"; 
	}

	public static class ConstantsForgotPasswordPage
	{
		public static final By TXT_EMAIL = By.name("email");
		public static final By BTN_SUBMIT = By.className("btn btn-large btn-primary pull-left");
		public static final By LNK_BACK_LOGIN = By.linkText("Voltar para o login");		
	}

	public static class ConstantsHeader
	{
		public static final By USER_NAV_BAR = By.className("dropdown-toggle");
		public static final By USER_NAV_BAR_LOGOUT = By.id("logout");
		public static final By USER_NAV_BAR_SETTINGS = By.id("settings");
		public static final By PROJECT_NAV_BAR = By.className("dropdown open");
		public static final By PROJECT_NAV_BAR_MANAGE_PROJECT = By.id("accountHeader");
		public static final By PROJECT_NAV_BAR_CHANGE_PROJECT = By.id("change_project");
		public static final By PROJECT_NAV_BAR_NEW_PROJECT = By.id("new_project");


	}

	public static class ConstantsUpload
	{
		public static final By MNU_UPLOAD = By.id("mn-upload");
		public static final By BTN_SELECT_FILE_TO_UPLOAD = By.cssSelector("input[type='file']");
		public static final By LNK_CLEAR_COMPLETED_UPLOAD = By.xpath("//a[contains(text(),'Limpar envios concluídos')]");
		public static final By BTN_CANCEL_UPLOAD = By.xpath("//a[contains(text(),'×')]");
		public static final By LBL_NAME_FILE = By.className("muted");
		public static final By PRG_STATUS = By.className("bar");
		public static final By LINES_STATUS_NAME_FILE = By.xpath("//tr//td");

	}

	public static class ConstantsContent
	{
		public static final By MNU_CONTENT = By.id("mn-content");
		public static final By LBL_ATIVE_FILTER = By.className("trackFilterAtive");
		public static final By LBL_INACTIVE_FILTER = By.className("trackFilterInactive");
		public static final By LBL_HIGH_LIGHTED_FILTER = By.className("trackFilterHighLighted");
		public static final By LBL_PROCESSING_FILTER = By.className("trackFilterProcessing");
		public static final By LBL_ERROR_FILTER = By.className("trackFilterError");
		public static final By CBO_TYPE_FILTER = By.id("filter-type");
		public static final String CBO_TYPE_FILTER_VALUE_OPTION_ALL= "AUDIO,IMAGE,VIDEO";
		public static final String CBO_TYPE_FILTER_VALUE_OPTION_AUDIO= "AUDIO";
		public static final String CBO_TYPE_FILTER_VALUE_OPTION_IMAGE= "IMAGE";
		public static final String CBO_TYPE_FILTER_VALUE_OPTION_VIDEO= "VIDEO";
	}

	public static class ConstantsPath
	{
		public static final String SCREENSHOT = "D:\\SeleniumScreenShots\\";
		public static final String DIRECTORY_WITH_FILES = "C:\\Users\\Luciana\\Downloads";
	}

	public static class ConstantsErrorMessage
	{
		public static final String MSG_MSG_SUCESS = "Mensagem de sucesso não está correta";
		public static final String MSG_MSG_ERROR = "Mensagem de erro não está correta";
	}
	
	public static class ConstantsExtension
	{
		public static final String XLS = ".xls";
		public static final String JPEG = ".jpeg";
		public static final String PDF = ".pdf";
	}

	public class ConstantsBrowser 
	{
		public static final String CHROME = "chrome";
		public static final String IE = "ie";
		public static final String FIREFOX = "firefox";
	}
}
