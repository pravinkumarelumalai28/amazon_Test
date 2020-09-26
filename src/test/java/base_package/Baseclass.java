package base_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;





public class Baseclass {

	public static WebDriver driver;

	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
		
		
}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public void entry(WebElement element, String content) {
		try{
			try{
				element.clear();
			}catch(Exception e1){
				element.sendKeys(Keys.DELETE);
			}
		}catch (Exception e) {

		}
		element.sendKeys(content);
	}

	

	public void click(WebElement element) {
		element.click();
	}
	
	public String getproperty(String value) throws FileNotFoundException, IOException
	{
		Properties properties= new Properties();
		properties.load(new FileInputStream(new File(".//Testdata//amazon.properties")));
		String property = properties.getProperty(value);
		return property;
	}
	
	

	
	
	public static void closeBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
		}
	}

}
