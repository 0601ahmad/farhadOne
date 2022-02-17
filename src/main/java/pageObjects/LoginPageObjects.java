package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageObjects extends Base {
	
	public LoginPageObjects() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath ="//a[text()='TEST ENVIRONMENT']")
	private WebElement textToValidate;
	@FindBy(xpath ="//span[text()='My Account']")
	private WebElement myAccountButton;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginButton;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement userNameField;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passField;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginB;
	
	public void textV() {
		String text = textToValidate.getText();
		if(text.equalsIgnoreCase("TEST ENVIRONMENT")) {
			logger.info("Text verified!");
		}else {
			logger.info("Text does not verified!");
		}
	}
	public void tButton() {
		myAccountButton.click();
	}
	public void tLogin() {
		loginButton.click();
		
	}
	public void userName() {
		userNameField.sendKeys("farhad@gmail.com");
	}
	public void passField() {
		passField.sendKeys("45678");
	}
	public void buttonMe() {
		loginB.click();
	}
	public void userName(String username) {
		userNameField.sendKeys("farhad@gmail.com");
	}
	public void passField(String password) {
		passField.sendKeys("45678");
	}
	

}
