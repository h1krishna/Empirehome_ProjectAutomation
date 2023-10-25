package com.Page_objects;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.Base.Test_base;

	public class Login_Functionality extends Test_base {

		public Login_Functionality() throws Throwable {
			super();
		}



		@FindBy (xpath="//input[@placeholder='example@gmail.com']")
		WebElement username;
		
		
		@FindBy (xpath="//input[@placeholder='******']")
		WebElement password;
		
		
		@FindBy (xpath="//button[text()='Login']") 
		WebElement loginbutton;
		
		
		
		public void Login_functionality(WebDriver driver)throws Throwable {
			
			PageFactory.initElements(driver, this);
			
		}
		
		
		
		public Homepage Dologin() {
			
		username.sendKeys(props.getProperty("username"));	
		password.sendKeys(props.getProperty("password"));
		
		loginbutton.click();
		
		return new Homepage();
		
			
		}
		public Homepage Dologinwithexcel(String Username, String Password) {
			
			username.sendKeys(Username);	
			password.sendKeys(Password);
			
			loginbutton.click();
			
			return new Homepage();
			
		}
		
		

}

