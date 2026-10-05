package OrganizationsTest;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.crm.CustomerManagement.Baseclass;
import com.crm.CustomerManagement.FileUtility;
import com.crm.CustomerManagement.JavaUtility;
import com.crm.CustomerManagement.SeleniumUtility;
import objectRepository.HomePage;
import objectRepository.OrganizationPage;

public class CreateOrganization extends Baseclass{
	SeleniumUtility s=new SeleniumUtility();
	@Test
	public void createOrg() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.getOrganizationElement().click();
		OrganizationPage op=new OrganizationPage(driver);
		op.getPlusicon().click();
		FileUtility f=new FileUtility();
		String orgname = f.readDataFromExcelForStringData("OrgData", 1, 1);
		JavaUtility j=new JavaUtility();
		int random = j.getGeneratedRandomNumber(20);	
		op.getOrgnamebx().sendKeys(orgname+random);
		String email = f.readDataFromExcelForStringData("OrgData", 1, 2);
		op.getEmailbx().sendKeys(email);
		WebElement address=op.getIndustrybx();
		s.selectOptionByContainsText(address,"Technology");
		WebElement type = op.getTypebx();
		s.selectOptionByContainsText(type,"Customer");
		String billingaddress=f.readDataFromExcelForStringData("OrgData", 1, 3);
		String shippingaddress=f.readDataFromExcelForStringData("OrgData", 1, 4);
		String billingcity=f.readDataFromExcelForStringData("OrgData", 1, 5);
		String shipcity=f.readDataFromExcelForStringData("OrgData", 1, 6);
		String billingstate=f.readDataFromExcelForStringData("OrgData", 1, 7);
		String shippingstate=f.readDataFromExcelForStringData("OrgData", 1, 8);
		String billingcountry=f.readDataFromExcelForStringData("OrgData", 1, 9);
		String shippingcountry=f.readDataFromExcelForStringData("OrgData", 1, 10);
		String desp=f.readDataFromExcelForStringData("OrgData", 1, 11);
		op.getBillingAddressbx().sendKeys(billingaddress);
		op.getShippingAddressbx().sendKeys(shippingaddress);
		op.getBillingstate().sendKeys(billingstate);
		op.getShippingstate().sendKeys(shippingstate);
		op.getBillingcitybx().sendKeys(billingcity);
		op.getBillingcountry().sendKeys(billingcountry);
		op.getShippingcountry().sendKeys(shippingcountry);
		op.getShippingcitybx().sendKeys(shipcity);
		op.getDescriptionbx().sendKeys(desp);
		op.getSavebtn().click();
		
	}
	
	@Test
	public void deleteOrg() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.getOrganizationElement().click();
		Thread.sleep(5000);
		OrganizationPage op=new OrganizationPage(driver);
		op.getDeleteOrgName().click();
		op.getDeleteBtn().click();
		s.alertPopupForAccept(driver);
		
		
	}

}
