package com.android.facebooktest;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.core.UiObjectNotFoundException;


public class FacebookTest extends UiAutomatorTestCase {
	
	private final String ICON_LAUNCHER_ID = "Facebook";
	private final String LOGIN_FIELD_ID = "com.facebook.katana:id/login_username";
	private final String PASSWORD_FIELD_ID = "com.facebook.katana:id/login_password";
	private final String LOGIN_BUTTON_ID = "com.facebook.katana:id/login_login";
	private final String VALID_USER_MAIL = "test@test.com";
	private final String VALID_USER_PASSWORD = "test_password";
	
	public void testFacebookValidUserAuthorization() throws UiObjectNotFoundException {
		
		getUiDevice().pressHome();
		
		UiObject facebookIcon = new UiObject(new UiSelector()
						.text(ICON_LAUNCHER_ID));
		
		facebookIcon.clickAndWaitForNewWindow();
				
		UiObject facebookLoginField = new UiObject(new UiSelector()
						.resourceId(LOGIN_FIELD_ID));
		
		facebookLoginField.click();
		facebookLoginField.clearTextField();
		// VALID_USER_MAIL is a real user's facebook e-mail constant 
		facebookLoginField.setText(VALID_USER_MAIL);
		UiObject facebookPasswordField = new UiObject(new UiSelector()
						.resourceId(PASSWORD_FIELD_ID));
		facebookPasswordField.click();
		// VALID_USER_PASSWORD is a real user's facebook password
		facebookPasswordField.setText(VALID_USER_PASSWORD);
		UiObject LoginButton = new UiObject(new UiSelector()
						.resourceId(LOGIN_BUTTON_ID));
		LoginButton.click();			
		
		getUiDevice().pressBack();
	}
}
