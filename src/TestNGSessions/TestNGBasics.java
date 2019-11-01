package TestNGSessions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGBasics {
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://freecrm.com/");
	}
	@Test
	public void TC01_verifyPageTitleTest()
	{
		String title=driver.getTitle();
		System.out.println("The page title is:" +title);
		Assert.assertEquals(title,"Free CRM #1 cloud software for any business large or small");
		
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	

}
