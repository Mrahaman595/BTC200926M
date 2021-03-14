package com.bit.ui.test;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	WebDriver driver; 
	@Before
	public void start() {
		String b=System.getProperty("brower");
		if(b.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(b.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.get("http:www.express.com");
	}

}
