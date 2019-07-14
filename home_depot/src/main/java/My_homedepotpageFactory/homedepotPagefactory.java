package My_homedepotpageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homedepotPagefactory {
	
WebDriver driver;

@FindBy(id="headerMyAccount")
WebElement myAccountmenu;
@FindBy(xpath="(//*[@id=\"authRegister\"]/a)[2]")
WebElement myRegisterlink;
@FindBy(xpath="(//*[@id=\"email_id\"])[2]")
WebElement myEmailinp;
@FindBy(xpath="//*[@id=\"registrationPassword\"]")
WebElement myPasswordinp;
@FindBy(id="zipcode")
WebElement myZipcodeinp;
@FindBy(id="phoneNumber")
WebElement myPhonenumberinp;
@FindBy(id="accountRegister")
WebElement myAccountRegisterbutton;

public homedepotPagefactory (WebDriver driver) {
	this.driver= driver;
	
	
}
public void homedepotAccount(String typeEmail,String typePassword,String typeZip, String typePhone) {
	
	myAccountmenu.click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	myRegisterlink.click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	myEmailinp.sendKeys(typeEmail);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	myPasswordinp.sendKeys(typePassword);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	myZipcodeinp.sendKeys(typeZip);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	myPhonenumberinp.sendKeys(typePhone);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	myAccountRegisterbutton.click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	
}

}

