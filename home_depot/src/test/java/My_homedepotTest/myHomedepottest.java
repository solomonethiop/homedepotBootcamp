package My_homedepotTest;

import org.testng.annotations.Test;

import My_homedepotpageFactory.OpenBrowser;
import My_homedepotpageFactory.homedepotPagefactory;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class myHomedepottest {
	WebDriver driver;
	
  @Test
  @Parameters({"browser","url","email","pass","zip","phone"})
  public void f(String browser, String url,String email,String pass,String zip,String phone) {
	  WebDriver driver = OpenBrowser.getDriver( browser, url);
	  homedepotPagefactory sel = PageFactory.initElements(driver, homedepotPagefactory.class);
	  sel.homedepotAccount(email,pass,zip,phone);


	  
	  
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
