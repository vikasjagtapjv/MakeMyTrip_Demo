package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//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
public class Demo {
	 static WebDriver driver;
	public static void main(String[]args)//2
	{
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		WebElement ele1=driver.findElement(By.xpath("//select[@id='day']"));
		selectOptionsFromDropdown(ele1,"8");
		WebElement ele2=driver.findElement(By.xpath("//select[@id='month']"));
		selectOptionsFromDropdown(ele2,"Apr");
		WebElement ele3=driver.findElement(By.xpath("//select[@id='year']"));
		selectOptionsFromDropdown(ele3,"2022");
	}
	public static void selectOptionsFromDropdown(WebElement element,String value)//1
	{
		Select sel=new Select(element);
		List<WebElement>allOptions=sel.getOptions();
		for(WebElement option:allOptions)
		{
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}
		}
		
	}
	

}
