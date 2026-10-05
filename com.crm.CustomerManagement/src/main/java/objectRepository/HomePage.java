package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.CustomerManagement.SeleniumUtility;

public class HomePage {
	
	//declaration
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement profileElement;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutElement;
	
	@FindBy(xpath="//a[text()='Organizations']/parent::td[@class='tabUnSelected']")
	private WebElement organizationElement;
	
	
	//initialization
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	
	//utilization
	
	public WebElement getProfileElement() {
		return profileElement;
	}
	

	public WebElement getSignoutElement() {
		return signoutElement;
	}
	
	public WebElement getOrganizationElement() {
		return organizationElement;
	}
	
	//Business logic

	public void logout(WebDriver driver) {
		HomePage hp=new HomePage(driver);
		WebElement element = hp.getProfileElement();
		SeleniumUtility s=new SeleniumUtility();
		s.mouseHover(driver, element);
		hp.getSignoutElement();
	}
	
	
}
