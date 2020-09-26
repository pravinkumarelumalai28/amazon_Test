package page_package;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_package.Baseclass;

public class SearchPageObj extends Baseclass {



	public SearchPageObj() {
		PageFactory.initElements(driver, SearchPageObj.class);
	}
	@FindBy(xpath="//a[@aria-label='Amazon']")
	public static WebElement amazon;

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	public static WebElement searchbox;

	@FindBy(xpath="//label[@for='twotabsearchtextbox']")
	public static WebElement search;

	@FindBy(xpath="//div[@id='nav-search-dropdown-card']//select")
	public static WebElement dropdown;

	public void getcategory() {
		try {
			click(dropdown);
			entry(dropdown, getproperty("select"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getsearchtext() {
		entry(searchbox,"Apple");
		click(search);
	}








}
