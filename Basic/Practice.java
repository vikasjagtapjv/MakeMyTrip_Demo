package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice {
	public static WebDriver driver;

	@BeforeMethod
	public void setUp() throws InterruptedException {
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--headless");
//		driver=new ChromeDriver(options);
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize();

	}

	@Test
	public void Test() throws InterruptedException {
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']//i")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='specialFareNew']//li"));
		int number = ele.size();
		System.out.println("size is: " + number);
		for (WebElement e : ele) {
			String s = e.getAttribute("class");		
					System.out.println(s);
		}

	}

}
