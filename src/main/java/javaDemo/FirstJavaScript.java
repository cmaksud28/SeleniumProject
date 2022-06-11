package javaDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJavaScript {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maksud\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//Simple Alert
	/*driver.get("http://ksrtc.in/oprs-web/ticket/waitlist.do");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Click submit
	driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
	Thread.sleep(5000);
	String simpleAlert=driver.switchTo().alert().getText();
	System.out.println(simpleAlert);
	driver.switchTo().alert().accept();*/
	
	//Confirmation alert
	/*driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	//click on Leads
	driver.findElement(By.linkText("Leads")).click();
	//click create lead link
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.linkText("Merge Leads")).click();
	driver.findElement(By.linkText("Merge")).click();
	String confirmAlert =driver.switchTo().alert().getText();
	System.out.println(confirmAlert);
	driver.switchTo().alert().accept();*/
	
	//PromtAlert 
	/*driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	Alert PromptAlert= driver.switchTo().alert();
	PromptAlert.getText();
	System.out.println(PromptAlert.getText());
	PromptAlert.accept();*/
	
	//PromtAlert1
	/*driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	Alert PromtAlert=driver.switchTo().alert();
	Thread.sleep(1000);
	PromtAlert.getText();
	System.out.println(PromtAlert.getText());
	PromtAlert.dismiss();*/
	
	//PromtSendkeys
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	Alert PrompAlert=driver.switchTo().alert();
	Thread.sleep(1000);
	PrompAlert.sendKeys("Rafi is a good man");
	Thread.sleep(1000);
	PrompAlert.getText();
	System.out.println(PrompAlert.getText());
	PrompAlert.dismiss();
	
	
	
	
	
	
	
	
	
	}

}
