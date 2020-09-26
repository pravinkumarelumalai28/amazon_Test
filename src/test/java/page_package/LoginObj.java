package page_package;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_package.Baseclass;


public class LoginObj extends Baseclass{

	public LoginObj() {
		PageFactory.initElements(driver, LoginObj.class);
	}
	@FindBy(xpath="//span[text()='Hello, Sign in']")
	public static WebElement Siginbt;

	@FindBy(xpath="//input[@id='ap_email']")
	public static WebElement email;

	@FindBy(xpath="//input[@id='continue']")
	public static WebElement Continue;

	@FindBy(xpath="//input[@id='ap_password']")
	public static WebElement password;

	@FindBy(xpath="//input[@type='submit']")
	public static WebElement Loginbt;



	public void login() {
		click(Siginbt);
	}
	public void getuser() {
		try {
			entry(email,getproperty("username"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getconti() {
		click(Continue);
	}
	public void getpass() {
		try {
			entry(password,getproperty("password"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getloginbt() {
		click(Loginbt);
	}










}
