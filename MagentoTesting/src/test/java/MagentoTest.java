import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest
{
	@Test
	public void test()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magento.com");
		Welcome w=new Welcome(driver);
		w.clickOnMyAccount();
		Login l = new Login(driver);
		l.loginAction("kundansinghmahisour@gmail.com", "Welcome@123");
		Home h = new Home(driver);
		h.clickOnLogout();
		driver.quit();
		
	}

}
