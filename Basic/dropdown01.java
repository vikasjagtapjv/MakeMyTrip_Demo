package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown01 {
	public static void main(String[] args) {
		//bootStrap dropdown
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.get("https://hdfcbank.com");
		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		List<WebElement>ele=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		System.out.println(ele.size());
		
		for(WebElement ele1:ele)
		{
			if(ele1.getText().equals("Accounts"))
			{
				ele1.click();
				break;
			}
		}
		driver.findElement(By.xpath("//a[text()='Select Product']")).click();
		List<WebElement>elem=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		System.out.println(elem.size());
		for(WebElement ele2:elem)
		{
			
				if(ele2.getText().equals("Salary Accounts")) 
				{
					ele2.click();
				     break;
			     }
			
		}
		
	}
	

}
