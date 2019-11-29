package objectRepository;

import org.openqa.selenium.By;

import utility.BC;

public class HMSPRLocators extends BC{
	public By username = By.xpath("//input[@name='username']");
	public By password = By.xpath("//input[@name='password']");
	public By login = By.xpath("//input[@name='submit']");
	public By registration = By.linkText("Registration");
}
