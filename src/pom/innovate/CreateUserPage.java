package pom.innovate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateUserPage
{
	
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Create Users']")
	private WebElement createUsersLink;
	
	@FindBy(xpath="//a[text()='Manage Users']") 
	private WebElement manageUsersLink;
	
	@FindBy(xpath="//input[@id='users-userprofile']")
	private WebElement fileUploadButton;
	
	@FindBy(xpath="//select[@id='selected_role']")
	private WebElement selectRoleDropdown;
	
	@FindBy(xpath="//input[@id='users-name']")
	private WebElement userName;    
	
	@FindBy(xpath="//input[@id='users-mobile']")
	private WebElement mobileNumber;
	
	@FindBy(xpath="//input[@id='users-email']")
	private WebElement userEmail;
	
	@FindBy(xpath="//input[@id='users-password']")
	private WebElement userPassword;
	
	@FindBy(xpath="//select[@id='department_id']")
	private WebElement departmentDropdown;
	
	@FindBy(xpath="//input[@id='users-qualification']")
	private WebElement userQualifiaction;
	
	@FindBy(xpath="//button[text()='Create']")
	private WebElement createButton;
	
	@FindBy(xpath="//a[text()='hemanth.s@pacewisdom.com']")
	private WebElement userEmailVerification;
	
	@FindBy(xpath="//a[text()='hemanth.s@pacewisdom.com']/../../td[6]/a[1]")
	private WebElement userViewButton;
	
	@FindBy(xpath="//a[text()='hemanth.s@pacewisdom.com']/../../td[6]/a[2]")
	private WebElement userUpdateButton;
	
	@FindBy(xpath="//button[text()='Update']")
	private WebElement UpdateButton;
	
	@FindBy(xpath="//a[text()='Users']")
	private WebElement usersBreadcum;
	
	public CreateUserPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void createUserFlow()
	{
		manageUsersLink.click();
		createUsersLink.click();
		Select select=new Select(selectRoleDropdown);
		select.selectByVisibleText("Medical Students");
		userName.sendKeys("TestName");
		mobileNumber.sendKeys("8147701271");
		userEmail.sendKeys("test@test.com");
	    userPassword.sendKeys("test@123");
	    Select select1=new Select(departmentDropdown);
		select1.selectByVisibleText("    General Pediatrics");
		fileUploadButton.sendKeys("/home/srinivas/Desktop.screeshop1.png");
		userQualifiaction.sendKeys("MBBS,MS at Harvard University");
		createButton.click();
		if(userEmailVerification.isDisplayed())
		{
			System.out.println("User has registered successfully");
		}
		else
		{
			System.out.println("Something went wrong");
		}
		
		
	}
	
}
