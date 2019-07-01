package sel1.test1.openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 * First Commit
 * Second
 * Eclispe comments
 */
public class OpenBrowser1 {

	@Test
	public void Test12(){
		// TODO Auto-generated method stub

		try
		{
			System.out.println("Started---");
			System.setProperty("webdriver.chrome.driver","C:\\Browers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://localhost:8080");
			driver.manage().window().maximize();
			System.out.println("Stopped---");
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
