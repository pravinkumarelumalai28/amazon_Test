package testNG_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base_package.Baseclass;
import scenario_package.Login_sce;
import scenario_package.Search_sce;

public class Test_case {

	WebDriver driver;
	Baseclass Bc;
	Login_sce Lc;
	Search_sce Ss;
	
	@BeforeSuite
	public void initialize() {
		driver = new ChromeDriver();
		Bc = new Baseclass();
		Lc = new Login_sce();
		Ss = new Search_sce();
		
		
		
	}
	@Test(priority=0)
	public void loginTest() {
		Lc.loginmethod();
		
	}
	@Test(priority=1)
	public void SearchTest() {
		Ss.searchmenthod();
		
	}
}
