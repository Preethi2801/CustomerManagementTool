package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//declaration
	
	@FindBy(name="user_name")
	private WebElement usernametbx;
	
	@FindBy(name="user_password")
	private WebElement pwtbx;
	
	@FindBy(id="submitButton")
	private WebElement lgbtn;
	
	@FindBy(xpath="//img[@alt='logo']")
	private WebElement Logo;
	
	@FindBy(xpath="//a[text()='vtiger']")
	private WebElement vtigerText;
	
	@FindBy(xpath="//td[contains(text(),'Get more out of vtiger CRM')]")
	private WebElement getmoreText;
	
	//initialization

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//utilization
	
	public WebElement getUsernametbx() {
		return usernametbx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}
	
	public WebElement getLogo() {
		return Logo;
	}
	
	//Business logic
	
	public void login(WebDriver driver,String un,String pwd) {
		LoginPage lg=new LoginPage(driver);
		lg.getUsernametbx().sendKeys(un);
		lg.getPwtbx().sendKeys(pwd);
		lg.getLgbtn().click();
	}
	

}
