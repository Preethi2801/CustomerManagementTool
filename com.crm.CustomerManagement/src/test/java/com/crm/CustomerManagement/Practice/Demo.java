package com.crm.CustomerManagement.Practice;

import org.testng.annotations.Test;
import com.crm.CustomerManagement.Baseclass;

import objectRepository.HomePage;

public class Demo extends Baseclass {
	@Test
	public void test() {
		HomePage hp=new HomePage(driver);
		hp.getOrganizationElement().click();
	}
}
