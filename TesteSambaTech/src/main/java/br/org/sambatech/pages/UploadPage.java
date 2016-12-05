package br.org.sambatech.pages;

import br.org.sambatech.common.Constants.ConstantsUpload;
import br.org.sambatech.util.Utils;

public class UploadPage 
{
	public static void AccessUploadPage()
	{
		Utils.IsClickableAndClick(ConstantsUpload.MNU_UPLOAD);
	}
	
	public static void UploadFile(String p_nameFile)
	{
		AccessUploadPage();
		Utils.UploadFile(ConstantsUpload.BTN_SELECT_FILE_TO_UPLOAD, p_nameFile);
	}
	
	public static void CancelUpload()
	{
		Utils.IsClickableAndClick(ConstantsUpload.BTN_CANCEL_UPLOAD);
	}
	
	public static void ClearCompletedUpload()
	{
		Utils.IsClickableAndClick(ConstantsUpload.LNK_CLEAR_COMPLETED_UPLOAD);
	}
	
	
}
