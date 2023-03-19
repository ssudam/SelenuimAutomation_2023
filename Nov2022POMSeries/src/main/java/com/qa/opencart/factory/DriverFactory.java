package com.qa.opencart.factory;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.aspectj.util.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
	
	public WebDriver driver; // right now its set to null
	
	public Properties prop; // any methods can access 
	
	public OptionsManager optionsmanager;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	/**
	 * 
	 * @param browserName
	 * @return
	 */
	
	public WebDriver initDriver(Properties prop) {
		
		optionsmanager=new OptionsManager(prop); // we are creating obj so we can initailze prop
		String browserName= prop.getProperty("browser");
		
		System.out.println("browsername is .."+browserName);
		
		if(browserName.trim().equalsIgnoreCase("chrome")) {
			//driver=new ChromeDriver(optionsmanager.getChromeOptions());
			tlDriver.set(new ChromeDriver(optionsmanager.getChromeOptions()));

		}
		else if(browserName.trim().equalsIgnoreCase("edge")) {
			driver=new EdgeDriver(optionsmanager.getEdgeOptions());
			
		}
		else if(browserName.trim().equalsIgnoreCase("firefox")) {
			//driver=new FirefoxDriver(optionsmanager.getFirefoxOptions());
		
			tlDriver.set(new FirefoxDriver(optionsmanager.getFirefoxOptions()));

		}else if(browserName.trim().equalsIgnoreCase("safari")) {
			//driver=new SafariDriver();
			tlDriver.set(new SafariDriver());
		}
		else {
			System.out.println("please pass right browser"+browserName);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		getDriver().get(prop.getProperty("url"));
		return getDriver();
	}
	
	/*
	 * get the local thread copy of the driver
	 */
	public synchronized static WebDriver getDriver() {
		return tlDriver.get();
	}
	
	/**
	 * this is properties class we are using so created object of it 
	 * using prop as reference 
	 * @return
	 * @throws Exception 
	 */

	
	public Properties initProp() {
		
		prop=new Properties(); 
		try {
			FileInputStream ip= new FileInputStream("./src/test/resources/Config/config.properties");
		    prop.load(ip); // reads  all properties from config.prop file
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
		
		// mvn clean install -Denv="qa"
				// mvn clean install
		
//				prop = new Properties();
//				FileInputStream ip = null;
//				String envName = System.getProperty("env");
//				System.out.println("Running test cases on Env: " + envName);
//
//				try {
//					if (envName == null) {
//						System.out.println("no env is passed....Running tests on QA env...");
//						ip = new FileInputStream("./src/test/resources/config/qa.config.properties");
//					} else {
//						switch (envName.toLowerCase().trim()) {
//						case "qa":
//							ip = new FileInputStream("./src/test/resources/config/qa.config.properties");
//							break;
//						case "stage":
//							ip = new FileInputStream("./src/test/resources/config/stage.config.properties");
//							break;
//						case "dev":
//							ip = new FileInputStream("./src/test/resources/config/dev.config.properties");
//							break;
//						case "prod":
//							ip = new FileInputStream("./src/test/resources/config/config.properties");
//							break;
//
//						default:
//							System.out.println("....Wrong env is passed....No need to run the test cases....");
//							throw new EOFException("WRONG ENV IS PASSED...");
//							//break;
//						}
//
//					}
//				} catch (FileNotFoundException e) {
//
//				} catch (EOFException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//				try {
//					prop.load(ip);
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//
//				return prop; 
				
	}
	
	/**
	 * take screenshot
	 */
	public static String getScreenshot() {
		File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/screenshot/" + System.currentTimeMillis() + ".png";
		File destination = new File(path);
		try {
			FileUtil.copyFile(srcFile, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}
}
