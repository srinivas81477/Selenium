package script.innovate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import library.ReadExcelData;
import pom.innovate.CommonElementsPage;
import pom.innovate.LoginPage;

public class BaseTest
{
	public WebDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		System.setProperty("webdriver.firefox.marionette","/home/srinivas/Downloads/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://innovate.pacewisdom.com");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		String xpath="./excel/Login1.xlsx";
		String sheetName="sheet1";
		String username1=ReadExcelData.getCellData(xpath,sheetName,1,0);
		String password1= ReadExcelData.getCellData(xpath,sheetName,1,1);
		LoginPage lp=new LoginPage(driver);
		lp.adminLogin(username1,password1);
	}
	
	@AfterMethod
	public void postCondition()
	{
		try{
		CommonElementsPage cp=new CommonElementsPage(driver);
		cp.logout();
		}
		catch(Exception e){ 
			System.out.println(e);
			}
		driver.close();
	}

}
