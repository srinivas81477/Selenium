package pom.innovate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	WebDriver driver;

	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginLink;
	
	@FindBy(xpath="//input[@name='LoginForm[username]']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='LoginForm[password]']")
	private WebElement password;
	
	@FindBy(xpath="//Button[text()='Login']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void adminLogin(String username1,String password1)
	{
		loginLink.click();
		username.sendKeys(username1);
		password.sendKeys(password1);
		loginButton.click();
	}
}
