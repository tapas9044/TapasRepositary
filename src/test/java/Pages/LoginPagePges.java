package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Browser;
import Base.WebDriverCommonLib;

public class LoginPagePges extends WebDriverCommonLib {
	
	public LoginPagePges(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='iloginId']")
	public static WebElement companyID;
	
	/*public WebElement getCompanyID() {
		return companyID;
	}*/
	
	@FindBy(id="iloginId")
	public static WebElement UserID;
	
	/*public WebElement getUserID() {
		return UserID;
	}*/
	
	@FindBy(id="ipassword")
	WebElement Password;
	
	/*public WebElement getPassword() {
		return Password;
	}*/
	
	@FindBy(id="iloginButton")
	WebElement submmitbutton;
	
	/*public WebElement getsubmmitbutton() {
		return submmitbutton;
	}*/
	
	@FindBy(id="oa_comp_login_submit")
	WebElement submmitbuttonfordemo;
	
	public WebElement getsubmmitbuttonfordemo() {
	return submmitbuttonfordemo;
}
	
	public void loginToApp(String companyid,String username,String password) throws InterruptedException
	{
		Thread.sleep(5000);
		
	//	companyID.sendKeys(companyid);
	//	Thread.sleep(5000);
		UserID.sendKeys(username);
		Password.sendKeys(password);
		submmitbutton.click();
	}

	
	
}
