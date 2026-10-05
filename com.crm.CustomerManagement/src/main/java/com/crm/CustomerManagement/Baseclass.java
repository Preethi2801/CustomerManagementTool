package com.crm.CustomerManagement;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

import objectRepository.HomePage;
import objectRepository.LoginPage;

public class Baseclass {
	public static WebDriver driver;
	FileUtility f=new FileUtility();
	SeleniumUtility s=new SeleniumUtility();
	
	
	@BeforeSuite
	public void databaseConnected() {
		Reporter.log("database connected successfully",true);
	}
	
	@BeforeTest
	public void launchBrowser(@Optional("chrome") String BROWSER) throws IOException {
		if (BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		} 
		else if (BROWSER.equals("firefox")) {
			driver=new FirefoxDriver();
		} 
		else if (BROWSER.equals("edge")) {
			driver=new EdgeDriver();
		} 
		else {
			driver=new ChromeDriver();
		}
		
		s.maximizeBrowser(driver);
		s.implicitwait(driver);
		String URL = f.readDataFromProperty("url");
		s.navToApplication(driver, URL);
		Reporter.log("Browser launced and navigate to CMT successfully",true);
	}
	
	@BeforeMethod
	public void loginToCmt() throws IOException {
		String un = f.readDataFromProperty("username");
		String pwd = f.readDataFromProperty("password");
		LoginPage lp=new LoginPage(driver);
		lp.login(driver, un,pwd);
		Reporter.log("logged in to CMT successfully",true);
	}
	@AfterMethod
	public void logoutToCmt() {
		HomePage hp=new HomePage(driver);
		hp.logout(driver);
		Reporter.log("logged out successfully",true);
	}
	
	@AfterTest
	public void closeBrowser() {
		s.closeBrowser(driver);
		Reporter.log("Browser closed successfully",true);
	}
	
	@AfterSuite
	public void disconnectWithDatabase() {
		Reporter.log("Database disconnected successfully",true);
	}
}
