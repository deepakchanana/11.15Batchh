package SeleniumProject.Selenium;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleCode
{
	
	@Test
	public void testcase()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Data\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Options o= driver.manage();
		Window w=o.window();
		w.maximize();	
	}

}
