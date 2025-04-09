package cm.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHelper {

	public WebDriver launchChrome() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		return driver;
	}

	public void closeBrowser(WebDriver driver) {
		driver.quit();
	}

}
