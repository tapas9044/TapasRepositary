package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Browser;
import Base.WebDriverCommonLib;

public class ApplicationNavigationPage extends WebDriverCommonLib {
	
public ApplicationNavigationPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="ii_party_portletpartys1RoomNavitem2")
	WebElement createperson;
	
	@FindBy(xpath="(//input[@class='z-textbox'])[2]")
	WebElement Firstname;
	
	@FindBy(xpath="(//input[@class='z-textbox'])[4]")
	WebElement Lastname;
	
	
	@FindBy(xpath="(//span[@class='z-checkbox z-checkbox-default'])[1]")
	WebElement TaxIdCheckBox;
	
	
	@FindBy(xpath="(//a[@title='Save'])[2]")
	WebElement saveButton;
	
	@FindBy(xpath="//div[@id='ii_party_portletpartys1Caption1-cave']")
	WebElement ClaimManagmentButton;
	
	@FindBy(xpath="//span[text()='Home']")
	WebElement Homebutton;
	
	@FindBy(id="ii_party_portletpartys1RoomNavitem1")
	WebElement SearchCustomer;
	
	@FindBy(xpath="(//input[@class='z-textbox'])[8]")
	WebElement Namesearch;
	
	@FindBy(xpath="(//button[text()='Search'])[2]")
	WebElement SearchButton;
	
	
	
	
	
	//iCaption1
	
	
	public void clickNewproject() throws InterruptedException
	{
		Thread.sleep(3000);
		ClaimManagmentButton.click();
		Thread.sleep(3000);
		createperson.click();
		waitForPageToLoad();
		Firstname.sendKeys("Tapas");
		waitForPageToLoad();
		Lastname.sendKeys("Rout");
		waitForPageToLoad();
		TaxIdCheckBox.click();
		waitForPageToLoad();
		Thread.sleep(3000);
		saveButton.click();
		Thread.sleep(3000);
		Homebutton.click();
		Thread.sleep(3000);
		SearchCustomer.click();
		Thread.sleep(3000);
		Namesearch.sendKeys("Rout");
		Thread.sleep(3000);
		SearchButton.click();
		
		
		
	}
	

}
