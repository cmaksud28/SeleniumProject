package actionClasssLearn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActionClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\libs\\New folder (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("http://mrbool.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
					
		//select Content element and store it in a variable
		//WebElement content = driver.findElementByClassName("menulink");
		WebElement content = driver.findElementByClassName("menulink");
		//Create object of Actions class and pass the driver 
		
		Actions action = new Actions(driver);
		
		//perform moveToElement (Mouse Hover On) action, pass the element and use perform() method
		action.moveToElement(content).perform();
		
		//Then click the Articles element
		//driver.findElementByXPath("(//a[text()='Articles'])[1]").click();
		driver.findElementByXPath("(//a[text()='Courses'])[2]").click();
		//Xpath explanation:a=tagname [text format] text =text value under >Courses<, Index=2
	
		//wait 3 seconds
		Thread.sleep(3000);
		
		//close the browser
		driver.close();
	}

}
