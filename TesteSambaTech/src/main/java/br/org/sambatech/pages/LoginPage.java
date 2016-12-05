package br.org.sambatech.pages;

import br.org.sambatech.common.Constants.ConstantsErrorMessage;
import br.org.sambatech.common.Constants.ConstantsLoginPage;
import br.org.sambatech.util.Utils;

public class LoginPage {

	public static void FillLogin(String p_textEmail)
	{
		Utils.IsClickableClearAndFillOut(ConstantsLoginPage.TXT_EMAIL, p_textEmail);
	}

	public static void FillPassword(String p_textPassword)
	{
		Utils.IsClickableClearAndFillOut(ConstantsLoginPage.TXT_PASSWORD, p_textPassword);
	}

	public static void ClickBtnLogin()
	{
		Utils.IsClickableAndClick(ConstantsLoginPage.BTN_LOGIN);
	}

	public static void Login(String p_textEmail, String p_textPassword)
	{
		FillLogin(p_textEmail);
		FillPassword(p_textPassword);
		ClickBtnLogin();
	}
	
	public static void AcessForgotPassword()
	{
		Utils.IsClickableAndClick(ConstantsLoginPage.LNK_FORGOT_PASSWORD);
	}
	
	public static void CheckMessageError()
	{
		Utils.CompareLocatorTextWithMsg(ConstantsErrorMessage.MSG_MSG_ERROR, 
				ConstantsLoginPage.MSG_INCORRECT_LOGIN_PASSWORD, 
				ConstantsLoginPage.MSG_MSG_INCORRECT_LOGIN_PASSWORD);
	}
}
