package asses.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
		
		@FindBy(id="Email")
		private WebElement email;
		
		@FindBy(id="Password")
		private WebElement password;
		
		@FindBy(xpath="(//span[@class=\"MuiButton-label\"])[1]")
		private WebElement loginButton;

		public WebElement getEmail() {
			return email;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}

}
