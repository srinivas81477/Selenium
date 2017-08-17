package pom.innovate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EventsPage 
{
	public WebDriver driver;

	@FindBy(xpath="(//a[@class='dropdown-toggle'])[1]")
	private WebElement manageEventsLink;
	
	@FindBy(xpath="//a[text()='All Events']")
	private WebElement allEventsLink;
	
	@FindBy(xpath="//a[text()='Create Events']")
	private WebElement createEventsLink;
	
	@FindBy(xpath="//input[@id='events-title']")
	private WebElement eventTitle;
	
	@FindBy(xpath="//select[@id='user_id']")
	private WebElement selectUser;
			
	@FindBy(xpath="//select[@id='eventdepartments-department_id']")
	private WebElement selectDepartment;
	
	@FindBy(xpath="//select[@id='eventviewers-role_id']")
	private WebElement selectEventViewer;
	
	@FindBy(xpath="//input[@id='events-description']")
	private WebElement eventDescription;
	
	@FindBy(xpath="//input[@id='events-event_date']")
	private WebElement calender;
	
	@FindBy(xpath="//table[@class='table-condensed']")
	private WebElement calenderTable;
	
	@FindBy(xpath="//tr/td[contains(text(),'17')]")
	private WebElement date;
	
	@FindBy(xpath="(//button[@class='btn btn-info'])[2]")
	private WebElement selectTimeButton;
	
	@FindBy(xpath="(//i[@class='glyphicon glyphicon-chevron-up'])[2]")
	private WebElement selectHour;
	
	@FindBy(xpath="(//i[@class='glyphicon glyphicon-chevron-up'])[4]")
	private WebElement selectMinute;
	
	@FindBy(xpath="(//i[@class='glyphicon glyphicon-chevron-up'])[6]")
	private WebElement selectSession;
	
	@FindBy(xpath="//input[@id='events-venue']")
	private WebElement eventVenue;

	@FindBy(xpath="//input[@id='events-presentation_link']")
	private WebElement eventPresentationLink;
	
	@FindBy(xpath="//button[text()='Create']")
	private WebElement createButton;
	
	public EventsPage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	this.driver=driver;
	}
	
	public void testCreateEventFlow()
	{
		manageEventsLink.click();
		createEventsLink.click();
		eventTitle.sendKeys("TestTitle");
		Select select=new Select(selectUser);
		select.selectByVisibleText("TestUser");
		Select select1=new Select(selectDepartment);
		select1.selectByVisibleText("Have to give");
		Select select2=new Select(selectEventViewer);
		select2.selectByVisibleText("Have to give");
		eventDescription.sendKeys("Test Description");
		calender.click();
		date.click();
		selectHour.click();	
		selectMinute.click();
		selectSession.click();
		eventVenue.sendKeys("Rajaji Nagar, 1st block");
		createButton.click();
	}
}
