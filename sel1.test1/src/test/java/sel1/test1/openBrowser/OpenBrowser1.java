package sel1.test1.openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * First Commit
 */
public class OpenBrowser1 {

	public static void main(String[] args) {
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
