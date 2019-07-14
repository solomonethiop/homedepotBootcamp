package My_homedepotpageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {
	public static WebDriver driver;

	public OpenBrowser(){
		
	}

	public static WebDriver getDriver (){
		if(driver== null) {
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("..disable-notifications");
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\solom\\eclipse-workspace\\selenium_dem\\Driver\\chromedriver.exe");
			driver = new  ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
			
		}
		return driver;
		
	}
	public static WebDriver getDriver(String browserName, String url){
	if(driver==null) {
		if(browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\solom\\Downloads\\geckodriver-v0.24.0-win64 (2)\\geckodriver.exe");
			driver= new FirefoxDriver();
			
		}else if(browserName.equalsIgnoreCase("chrome")) {
			System.out.println("in chrome");
			System.setProperty("webdriver.chrome.driver" , "C:\\Users\\solom\\eclipse-workspace\\selenium_dem\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}else if (browserName.equalsIgnoreCase("IE")) {
			
			System.setProperty("webdriver.ie.driver" , "C:\\Users\\solom\\eclipse-workspace\\selenium_dem\\Driver\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		
			
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		
		driver.get(url);
		
	}
	return driver;
		
		
	}
	   
	}



