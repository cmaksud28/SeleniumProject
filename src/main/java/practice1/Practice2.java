package practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maksud\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jquery.com");
		driver.findElement(By.linkText("jQuery UI")).click();
		driver.findElement(By.linkText("Draggable")).click();
		//driver.findElement(By.xpath("")).click();
	    driver.findElement(By.linkText("Auto-scroll")).click();
	    driver.findElement(By.linkText("Droppable")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    driver.findElement(By.xpath("//a[@tabindex='0']")).click();
	    
	}

}
