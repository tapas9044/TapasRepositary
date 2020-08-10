package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author Tapas.Rout
 *@date-04/01/2019
 */

public class Browser {
	
	public static WebDriver driver;
	
public static WebDriver getBrowser()
{
	

	
	if(Constant.browser.equals("chrome"))
	{
		String path="C:\\Users\\tapas.rout\\eclipse-workspace\\Stream\\src\\main\\java\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
	}else if(Constant.browser.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	return driver;
	
}
}