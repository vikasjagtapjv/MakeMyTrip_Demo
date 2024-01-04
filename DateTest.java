import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pom.Base01;
import pom.Date;

public class DateTest {
	
	@Test
	public void dateTest() {
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.makemytrip.com/");
		
		WebElement ele1=driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[4]"));
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOf(ele1));
		Actions act =new Actions(driver);
		act.doubleClick(ele1).build().perform();
		WebElement ele2=driver.findElement(By.xpath("(//div[contains(@class,'DayPicker-Month')])[2]//p[text()='4']"));
		Actions act1 =new Actions(driver);
		act1.doubleClick(ele2).build().perform();	
		
		
		
		
		
	}

}
