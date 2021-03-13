import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utill.SeleniumHelper;

public class HomePage {

	WebDriver dr;
	
	@FindBy(xpath="whatever xpath") WebElement userBox;
	@FindBy(xpath="whatever xpath") WebElement passBox;
	@FindBy(xpath="whatever xpath") WebElement loginbutton;
	public HomePage(WebDriver x) {
		dr=x;
		PageFactory.initElements(dr, this);
	}
	public void typeUserId() {
		SeleniumHelper.type(userBox, "user21");
	}
	
	public void typePass() {
		SeleniumHelper.type(passBox, "p2343");
	}
	
	public ProfilePage clickLogin() {
		SeleniumHelper.click(loginbutton);
		return new ProfilePage(dr);
	}
