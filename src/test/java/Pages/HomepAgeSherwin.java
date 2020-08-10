package Pages;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.WebDriverCommonLib;

public class HomepAgeSherwin extends WebDriverCommonLib {
	
	public HomepAgeSherwin(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[@id='termsModal_closeBtn']")
	public static WebElement OKAlert;
	
	@FindBy(xpath="//button[contains(@id,'ensAllow')]")
	public static WebElement PrivacySettingAlert;
	
	
	
	/*public WebElement getCompanyID() {
		return companyID;
	}*/
	
	@FindBy(xpath="//a[contains(text(),'Shop Our Products')]")
	public static WebElement ShopOurProduct;
	
	@FindBy(xpath="//span[contains(text(),'For Homeowners')]")
	public static WebElement HomeOwners;
	
	
	@FindBy(xpath="//button[contains(text(),'Paints & Supplies')]")
	public static WebElement PaintsAndSupplies;
	
	@FindBy(xpath="//h3[contains(text(),'Interior Paint')]")
	public static WebElement Interiorpaint;
	
	@FindBy(xpath="//h3[contains(text(),'Exterior Deck Stains')]")
	public static WebElement ExteriorDeckStains;
	

	@FindBy(xpath="//a[contains(text(),'Emerald Designer Edition Interior Latex Paint')]")
	public static WebElement EmraldDesigner;
	
	@FindBy(xpath="//a[contains(text(),'Captivate Interior Latex')]")
	public static WebElement CaptiveInteriorLatex;
	
	
	
	public void loginToApp() throws InterruptedException
	{
		
		
		try {
			OKAlert.click();
			Thread.sleep(2000);
			PrivacySettingAlert.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("No Alert popup coming this time");
			
		}
		ShopOurProduct.click();
		Thread.sleep(5000);
		HomeOwners.click();
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		act.moveToElement(PaintsAndSupplies).build().perform();
		Thread.sleep(5000);
		act.moveToElement(PaintsAndSupplies).click().build().perform();
		
		act.moveToElement(ExteriorDeckStains).build().perform();
		Thread.sleep(5000);
		act.moveToElement(Interiorpaint).click().build().perform();
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(3000);
		act.moveToElement(EmraldDesigner).click().build().perform();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,300)", "");
		
		System.out.println("Test Execution Finished");
	}

}
