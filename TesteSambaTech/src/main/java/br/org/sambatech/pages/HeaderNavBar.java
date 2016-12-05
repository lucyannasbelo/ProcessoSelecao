package br.org.sambatech.pages;

import br.org.sambatech.common.Constants.ConstantsHeader;
import br.org.sambatech.util.Utils;

public class HeaderNavBar 
{
	public static void AccessUserSettings()
	{
		Utils.MouseOver(ConstantsHeader.USER_NAV_BAR,ConstantsHeader.USER_NAV_BAR_SETTINGS);
	}
	
	public static void Logout()
	{
		Utils.MouseOver(ConstantsHeader.USER_NAV_BAR,ConstantsHeader.USER_NAV_BAR_LOGOUT);
	}
	
	public static void AccessManageProject()
	{
		Utils.MouseOver(ConstantsHeader.PROJECT_NAV_BAR,ConstantsHeader.PROJECT_NAV_BAR_MANAGE_PROJECT);
	}
	
	public static void AccessChangeProject()
	{
		Utils.MouseOver(ConstantsHeader.PROJECT_NAV_BAR,ConstantsHeader.PROJECT_NAV_BAR_CHANGE_PROJECT);
	}

	public static void AccessNEWProject()
	{
		Utils.MouseOver(ConstantsHeader.PROJECT_NAV_BAR,ConstantsHeader.PROJECT_NAV_BAR_NEW_PROJECT);
	}
}
