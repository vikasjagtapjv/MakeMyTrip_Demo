package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBox {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	@Test(priority=0)
	public void singleCheckBox()
	{
		driver.findElement(By.xpath("//input[@value='red']")).click();
	}
	@Test(priority=1)
	public void multpleCheckbox()
	{
		List<WebElement>ele=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(ele.size());
//		for(int i=0;i<ele.size();i++)
//		{
//			ele.get(i).click();
//		}
		
		for(WebElement ele1:ele)
		{
			ele1.click();
		}
	}
	@Test(priority=2)
	public void selectCkeckBoxesByChoice()
	{
		List<WebElement>ele=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=ele.size()-2;i<ele.size();i++)
		{
			ele.get(i).click();
		}
	}
	@Test(priority=3)
	public void selectRandomCheckboxes()
	{
		List<WebElement>ele=driver.findElements(By.xpath("//input[@type='checkbox']"));

		for(WebElement ele1:ele)
		{
			String AttributeV=ele1.getAttribute("value");
			if(AttributeV.equals("red")||AttributeV.equals("orange"))
			{
				ele1.click();
			}
		}
	}
	@Test(priority=4)
	public void selecTopCheckboxes()
	{
		List<WebElement>ele=driver.findElements(By.xpath("//input[@type='checkbox']"));

		for(int i=0;i<ele.size();i++)
		{
			if(i<2)
			{
				ele.get(i).click();
			}
		}
			
	}

}
