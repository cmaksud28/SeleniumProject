package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchChrome {

	//public static void main(String[] args) throws InterruptedException {
	@Test
	public void launchChrome() throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maksud\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	//Implicitly wait
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	//enter username
	driver.findElementById("username").sendKeys("DemoSalesManager");
	//enter password
	driver.findElementById("password").sendKeys("crmsfa");
	//Click login
	driver.findElementByClassName("decorativeSubmit").click();
	//click CRM/SFA
	driver.findElementByLinkText("CRM/SFA").click();
	//click on Leads
	driver.findElementByLinkText("Leads").click();
	//click create lead link
	driver.findElementByLinkText("Create Lead").click();

	//
	driver.findElementById("createLeadForm_companyName").sendKeys("ABC");

	driver.findElementById("createLeadForm_firstName").sendKeys("Hema");

	driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
	//Explicitly wait
	Thread.sleep(2000);
	//Click create lead button
	driver.findElementByClassName("smallSubmit").click();

	
	}

}
