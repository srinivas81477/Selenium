package pom.innovate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonElementsPage 
{
	WebDriver driver;
	
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[2]")
	private WebElement accountLink;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutLink;
	
	public CommonElementsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	    this.driver=driver;
		
	}
	
	public void logout()
	{
		accountLink.click();
		logoutLink.click();
	}

}
