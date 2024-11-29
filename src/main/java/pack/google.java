package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class google {
	
	public WebDriver driver;
	@Test
	public void Browser_Launch () {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
	}
	
	@Test
	public void Open_Google () {
		driver.navigate().to("http://www.google.com/"); 
	}
	

}
