import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTC {
	
	@Test(priority=1)
	public void TC_1() throws InterruptedException
	{
		String path="C:\\Users\\tapas.rout\\eclipse-workspace\\Stream\\src\\main\\java\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testing.funnl.co.in/#/distributor-login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9916508567");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname='psw']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname='psw']")).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//li[@class='ng-tns-c4-1 ui-dropdown-item ui-corner-all ng-star-inserted'])[1]")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//td[@class='ng-star-inserted']/span[text()='New']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[1]")).sendKeys("1234567");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[2]")).sendKeys("1234567");
		Thread.sleep(3000);
		
		
		
	//	form-control ng-valid ng-dirty ng-touched
		
		driver.findElement(By.xpath("(//input[@value='accepted'])[1]")).click();
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)", "");
	
		driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
		
	
		Assert.assertTrue(driver.findElement(By.xpath("//button[contains(text(),'Done')]")).isDisplayed(), "Pass");
	
	
	}
	@Test
	public void m1()
	{
		
	}
}
