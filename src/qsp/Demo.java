package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./s1/geckodriver.exe");
		
	 WebDriver driver =  new FirefoxDriver();
	 driver.get("https://www.google.com");
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	 
	 System.out.println("hiiiiiiiiii");
	 
	 Reporter.log("helllllooooooooo",true);
	 
	 driver.quit();
	}

}
