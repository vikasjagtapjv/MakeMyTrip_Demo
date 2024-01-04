package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	 
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[1]//a[1]//span[1]")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Alice.Duval");
		Thread.sleep(3000);

		WebElement ele=driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
		ele.click();
		Thread.sleep(3000);
		WebElement ele1=driver.findElement(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']//div[2]"));
//		Actions act =new Actions(driver);
//		act.contextClick(ele1).build().perform();
		ele1.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Alice Duval");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='oxd-autocomplete-dropdown --positon-bottom'])[1]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='oxd-select-option']//span[text()='Enabled']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();


		//driver.findElement(By.xpath("//li[1]//a[1]//span[1]")).click();

		//driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
	}

}
