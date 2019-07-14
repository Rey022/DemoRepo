package MavenDemo1.MavenDemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeliniumTest {
	public static WebDriver driver;
	
	@Test
	public void testApp()
	{
		String ChromeDriverPath = "C:\\Users\\reshm\\Downloads\\selinium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

}
