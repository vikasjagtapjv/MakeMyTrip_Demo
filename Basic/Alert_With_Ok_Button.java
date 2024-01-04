package Basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alert_With_Ok_Button {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get("http://demo.automationtesting.in/Alerts.html");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	@Test
	public void okAlert()
	{
		
		WebElement ele=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		ele.click();
		Alert ralert=driver.switchTo().alert();
		ralert.accept();
		
	}
	@Test(priority=1)
	public void cancleAlert()
	{
		
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]")).click();
		driver.findElement(By.xpath("(//button[@onclick='confirmbox()'])")).click();
		Alert Ralert=driver.switchTo().alert();
		Ralert.dismiss();
	}
	@Test(priority=2)
	public void alert_With_InputBox()
	{
		WebElement ele=driver.findElement(By.xpath("//a[@href='#Textbox']"));
		ele.click();
		WebElement ele1=driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		ele1.click();
		Alert alerts=driver.switchTo().alert();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.alertIsPresent());
		alerts.sendKeys("Automation Test Engineerr");
		wait.until(ExpectedConditions.alertIsPresent());
		alerts.accept();
	}
	

}
