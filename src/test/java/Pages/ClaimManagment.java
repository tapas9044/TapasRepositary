package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.WebDriverCommonLib;

public class ClaimManagment extends WebDriverCommonLib {
	
public ClaimManagment(){
		
		PageFactory.initElements(driver, this);
		
	}
	
@FindBy(id="ii_claim_portletclaims1Caption1-cave")
public static WebElement ClaimManagmentLink;	

@FindBy(id="ii_claim_portletclaims1RoomNavitem2")
public static WebElement CreateClaim;

@FindBy(xpath="//button[text()='OK']")
public static WebElement OkButton;

@FindBy(id="iii_claim_claims1_claim_roominitiateclaims1DateboxEx1-real")
public static WebElement DateOfOccurance;

@FindBy(xpath="(//input[@class='z-textbox'])[2]")
public static WebElement PolicySearch;

@FindBy(xpath="(//a[@class='z-a'])[6]")
public static WebElement SearchButton;

@FindBy(xpath="//input[@value='existingPolicy']")
public static WebElement RadiobuttonSearch;












public void CreateClaim(int noofpolicyrequireds) throws InterruptedException
{
	Thread.sleep(3000);
	ClaimManagmentLink.click();
	
	try {
		Thread.sleep(3000);
		CreateClaim.click();
		Thread.sleep(3000);
		if(OkButton.isDisplayed())
		{
			OkButton.click();
		}
		
	}catch (Exception e) {
		OkButton.click();
		
	}
	
	for(int i=0;i<=noofpolicyrequireds;i++)
	{
	DateOfOccurance.sendKeys("03/01/2019");
	Thread.sleep(3000);
	RadiobuttonSearch.click();
	Thread.sleep(3000);
	PolicySearch.sendKeys("PA40000TEST");
	Thread.sleep(3000);
	SearchButton.click();
	Thread.sleep(3000);
	
	
	
}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
