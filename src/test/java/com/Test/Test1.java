package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test1 extends BaseClass{

	@Test
	public void Test_001() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		Library.custom_Sendkeys(login.gettxt_email(), "Test");
		Library.custom_Sendkeys(login.gettxt_password(), "12345678");
		Library.getScreenShotCapture();
		
		
		
	}
}
