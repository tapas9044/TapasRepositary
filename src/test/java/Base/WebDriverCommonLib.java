package Base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Tapas.Rout
 * @date-05/11/2018
 *
 */

public class WebDriverCommonLib extends Browser {

	public void waitForPageToLoad(){
		Browser.driver.manage().timeouts().implicitlyWait
		                         (30, TimeUnit.SECONDS);
	}

	public void waitForLinkNamePresent(String linkName){
		WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated
				(By.linkText(linkName)));
		
	}
	
	public void waitForXpathPresent(String wbXpath){
		WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated
				(By.xpath(wbXpath)));
		
	}
	
	public void waitForIDPresent(String wbID){
		WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated
				(By.id(wbID)));
		
	}
	
	
	public boolean verifyTest(WebElement wb , String expectedMsg){
		boolean flag = false;
		String actMsg = wb.getText();
		if(expectedMsg.equals(actMsg)){
			flag = true;
			System.out.println("msg is verfied==PASS");
		}else{
			System.out.println("msg is not verfied==FAIL");
		}
		return flag;
	}
	
	public void acceptAlert(){
		Alert alt = Browser.driver.switchTo().alert();
		alt.accept();
	}
	
	
	public void cancelAlert(){
		Alert alt = Browser.driver.switchTo().alert();
		alt.dismiss();
	}
	
	public static Connection getDBConnection()
	{
		Connection conn = null;
		String OJDBC_DRIVER = "com.ibm.db2.jcc.DB2Driver";
		
		String QA3DB_URL = "jdbc:db2://10.40.37.111:50000/QAWJD3";
		String QA3DB_USER = "stream";
		String QA3DB_PASS = "Db@dmin12";
		try {
			Class.forName(OJDBC_DRIVER);
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(QA3DB_URL, QA3DB_USER, QA3DB_PASS);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public String getMultipleValueDBResult(String query)
	{
		String value = "";
		Connection conn = null;
		ResultSet rs;
		HashMap<String, List<String>> table = new HashMap<String, List<String>>();
		List<String> rowList;
		try {
			conn = getDBConnection();
			System.out.println("Creating statement...");
			PreparedStatement stmt = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery();
			int columnCount=rs.getMetaData().getColumnCount();
			// System.out.println("size "+result);
			while(rs.next())
			{
				
				//String value = "";
		        for (int i = 1; i <= columnCount; i++) {
		        	value += rs.getString(i) + ";";  
		          //  System.out.println(value);
		        }
		        System.out.println(value);
				
			}
			conn.close();

			
		} catch (SQLException se) {

			se.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
		return value;
		
	}
	
	
	
}

