package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	//declaration
	
		@FindBy(xpath="//img[@title='Create Organization...']")
		private WebElement Plusicon;
	    
		@FindBy(name="accountname")
		private WebElement orgnamebx;
		
		@FindBy(name="industry")
		private WebElement industrybx;
		
		@FindBy(name="accounttype")
		private WebElement typebx;

		@FindBy(xpath="//td[text()='Email ']/following-sibling::td/child::input")
		private WebElement emailbx;
		
		@FindBy(name="bill_street")
		private WebElement BillingAddressbx;
		
		@FindBy(name="ship_street")
		private WebElement ShippingAddressbx;
		
		@FindBy(name="bill_city")
		private WebElement billingcitybx;
		
		@FindBy(name="ship_city")
		private WebElement Shippingcitybx;
		
		@FindBy(name="bill_state")
		private WebElement billingstate;
		
		@FindBy(name="ship_state")
		private WebElement shippingstate;
		
		@FindBy(name="bill_code")
		private WebElement billingpostalcode ;
		
		@FindBy(name="ship_code")
		private WebElement shippingpostalcode ;
		
		@FindBy(name="bill_country")
		private WebElement billingcountry;
		
		@FindBy(name="ship_country")
		private WebElement shippingcountry;
		
		@FindBy(name="description")
		private WebElement descriptionbx;
		
		@FindBy(name="button")
		private WebElement Savebtn;
		
		@FindBy(xpath="//input[@title='Cancel [Alt+X]']")
		private WebElement Cancelbtn ;
		
		
		@FindBy(xpath="(//a[text()='Google'])[2]/parent::td/preceding-sibling::td/child::input")
		private WebElement deleteOrgName;
		
		@FindBy(xpath="//input[@class='crmbutton small delete']") 
		private WebElement deleteBtn;
		
		

		//initialization
		
		public OrganizationPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		
		
		
		
		//utilization

		public WebElement getPlusicon() {
			return Plusicon;
		}

		public WebElement getOrgnamebx() {
			return orgnamebx;
		}

		public WebElement getIndustrybx() {
			return industrybx;
		}

		public WebElement getTypebx() {
			return typebx;
		}

		public WebElement getEmailbx() {
			return emailbx;
		}

		public WebElement getBillingAddressbx() {
			return BillingAddressbx;
		}

		public WebElement getShippingAddressbx() {
			return ShippingAddressbx;
		}

		public WebElement getBillingcitybx() {
			return billingcitybx;
		}

		public WebElement getShippingcitybx() {
			return Shippingcitybx;
		}

		public WebElement getBillingstate() {
			return billingstate;
		}

		public WebElement getShippingstate() {
			return shippingstate;
		}

		public WebElement getBillingpostalcode() {
			return billingpostalcode;
		}

		public WebElement getShippingpostalcode() {
			return shippingpostalcode;
		}

		public WebElement getBillingcountry() {
			return billingcountry;
		}

		public WebElement getShippingcountry() {
			return shippingcountry;
		}

		public WebElement getDescriptionbx() {
			return descriptionbx;
		}

		public WebElement getSavebtn() {
			return Savebtn;
		}

		public WebElement getCancelbtn() {
			return Cancelbtn;
		}

		public WebElement getDeleteOrgName() {
			return deleteOrgName;
		}

		public WebElement getDeleteBtn() {
			return deleteBtn;
		}
	
		
	
	
	
	

}
