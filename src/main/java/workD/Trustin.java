package workD;

import org.openqa.selenium.chrome.ChromeDriver;

public class Trustin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\libs\\New folder (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://staging.app.workd.com/");
		driver.findElementById("mat-input-0").sendKeys("mchowdhury@developrise.com");
		driver.findElementById("mat-input-1").sendKeys("1234@Jony");
		driver.findElementByClassName("button primary ng-star-inserted").click();

	}

}
