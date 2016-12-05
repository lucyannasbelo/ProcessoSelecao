package br.org.sambatech.pages;

import br.org.sambatech.common.Constants.ConstantsContent;
import br.org.sambatech.util.Utils;

public class ContentPage {

	public static void AccessContentMenu()
	{
		Utils.IsClickableAndClick(ConstantsContent.MNU_CONTENT);
	}
	
}
