package Basic;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sample01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
		JavascriptExecutor jre=(JavascriptExecutor)driver;
		jre.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	WebElement ele=	driver.findElement(By.xpath("(//ul//a[@href='/en/company/about-us/'])[3]"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		Set<String>se=driver.getWindowHandles();
//		Iterator<String>it=se.iterator();
//		
//		String parentID=it.next();
//		String childId=it.next();
//		System.out.println(parentID);
//		System.out.println(childId);
//		Thread.sleep(3000);
//		driver.switchTo().window(parentID);
//		driver.switchTo().window(childId);
		for(String id:se)
		{
			String Title=driver.switchTo().window(id).getTitle();
			if(Title.equals("OrangeHRM"))
			{
				driver.close();
			}
		}
		
	}

}
