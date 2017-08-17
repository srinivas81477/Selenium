package script.innovate;

import org.testng.annotations.Test;

import pom.innovate.CreateUserPage;

public class ValidUserCreation extends BaseTest
{
	
	@Test

	public void testCreateUserFlow()
	{
	CreateUserPage cu=new CreateUserPage(driver);
	cu.createUserFlow();
	}

	
}
