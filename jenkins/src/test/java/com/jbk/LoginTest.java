package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	LoginPage lp =null;

@BeforeMethod
public void setUp(){
	System.setProperty("webdriver.chrome.driver", "chromedriver2.exe");
	 driver = new ChromeDriver();
	driver.get("file:///E:/Offline%20Website/Offline%20Website/index.html");
	lp= new LoginPage(driver);
	
}
@Test// tester working login page
public void validLoginTest() {
	System.out.println("step2");
	lp.enterUname("kiran@gmail.com");
	lp.enterPass("123456");
	lp.clickLogin();
}



}
