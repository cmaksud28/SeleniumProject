package learnAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class learnAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maksud\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		/*dropdown of about us
		WebElement aboutUs = driver.findElement(By.linkText("ADMINISTRATION"));
         Select dd1 =new Select(aboutUs);
         dd1.selectByVisibleText("Bank");*/
		driver.navigate().to("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hema");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Malini");
		//dropdown
		WebElement src1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select ff=new Select(src1);
		ff.selectByIndex(5);
		//dropdown
		WebElement mCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select ff1=new Select(mCampaign);
		ff1.selectByVisibleText("Car and Driver");
		// dropdown
		WebElement curreNcy = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select ff2 = new Select(curreNcy);
		ff2.selectByValue("BDT");
		//dropdown
		WebElement indusTry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select ff3 = new Select(indusTry);
		ff3.selectByVisibleText("Retail");
		//dropdown Ownership
		WebElement owNer = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ff4 =new Select(owNer);
		ff4.selectByVisibleText("LLC/LLP");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("23");
		//
		
		
	}

}
