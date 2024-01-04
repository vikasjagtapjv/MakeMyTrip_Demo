package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver rdriver;
	public LoginPage(WebDriver ldriver)
	{
		rdriver=ldriver;
		PageFactory.initElements( ldriver,this);
		
	
	}
	@FindBy(id="admin_user_email")
	private WebElement userName;
	@FindBy(id="admin_user_password")
	private WebElement Password;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement save;
	@FindBy(xpath="//div[text()=' Products']")
	private WebElement product;
	@FindBy(xpath="(//button[@type='button'])[5]")
	private WebElement button;
	@FindBy(xpath="//input[@placeholder='Search products...']")
	private WebElement name;
	@FindBy(xpath="(//div[@class='ivu-input-number-input-wrap'])[1]")
	private WebElement price;

	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement desc ;

	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement cat ;

	@FindBy(xpath="(//input[@type='text'])[6]")
	private WebElement slug;
	@FindBy(xpath="(//input[@class='ivu-input-number-input'])[2]")
	private WebElement releaseYear;


	public void setUser(String user)
	{
		userName.sendKeys(user);
	}
	public void pass(String passw)
	{
		Password.sendKeys(passw);
	}

	public void clickSave()
	{
		Password.click();
	}

}

