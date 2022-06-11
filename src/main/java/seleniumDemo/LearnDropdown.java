package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maksud\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new  ChromeDriver();
        driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//enter username
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Balarishtam");
		//enter password
		driver.findElement(By.id("nav-search-submit-button")).click();
		//enter click button
		driver.findElement(By.className("s-image")).click();
		
	//Dropdown
		driver.findElement(By.linkText("Go to Cart")).click();
		WebElement quaNtity = driver.findElement(By.cssSelector("span[class='a-button-text a-declarative']"));
		Select ll=new Select(quaNtity);
		ll.selectByValue("quantity_5");
		driver.findElement(By.className("a-color-link")).click();
	
	} 

}
