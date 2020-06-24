package com.dotcom.keyword.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver init_driver(String browserName) 
	{
		if(browserName.equals("chrome"))
		{	
			
			System.setProperty("webdriver.chrome.driver", "D:\\Automation-master\\Driver\\chromedriver.exe");
		try {
			/*if(prop.getProperty("headless").equals("yes"))  
			{
				//headless mode
				
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--headless");
				driver =new ChromeDriver(options);
			}
			else 
			{
				driver= new ChromeDriver();
			}*/
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		}
		return driver;
	}
		
	
	 
	public Properties init_properties() 
	{
		prop=new Properties();
		try {
			FileInputStream ip=new FileInputStream("D:\\Automation-master\\src\\main\\java\\com\\dotcom\\qa\\keyword\\config\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return prop; 
	}

}
