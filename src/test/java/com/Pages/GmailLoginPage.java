package com.Pages;

import org.openqa.selenium.WebElement;

import seleniumFrameWork.BasePage;
import seleniumFrameWork.Button;
import seleniumFrameWork.TextField;

public class GmailLoginPage extends BasePage {

	public Button loginButton;
	public Button nextButton;
	public TextField userNameTextFiled;
	public TextField passwordTextField;

	public GmailLoginPage getPage() {

		if(!isPageInitialized) {
			getHtmlResourceLocators(this);
			initialiazePageObjects(this);				
		}
		return this;
	}
	
	public void clickLoginButton() {

        getPage().loginButton.click();
	}

	public void clickNextButton() {

        getPage().nextButton.click();
	}
	
	public void setUserNameTextFiled(String userNameValue) {		
		
		getPage().userNameTextFiled.setTextField(userNameValue);		
	}
	
	public WebElement getUserNameTextField() {
		return getPage().getUserNameTextField();
	}
	
	public void setPasswordTextField(String passwordValue) throws InterruptedException {

        Thread.sleep(3000L); //replace this with wait.until
		getPage().passwordTextField.setTextField(passwordValue);
	}
}
