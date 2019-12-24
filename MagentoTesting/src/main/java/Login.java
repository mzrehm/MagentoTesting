import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}
	By email=By.id("email");
	By password=By.id("pass");
	By login=By.id("send2");
	public void loginAction(String un,String pwd)
	{
		driver.findElement(email).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(login).click();
	}

}
