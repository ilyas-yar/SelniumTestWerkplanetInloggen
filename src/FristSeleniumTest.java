import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FristSeleniumTest {

	WebDriver driver;
	
	@Test
	
	public void lanuchBrower() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ilyas\\Desktop\\Webdriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.werkplanet.nl/");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.id("menu-item-37214"));
	driver.get("https://talentcenter.werkplanet.nl/nl/werknemers/functionality/account/inloggen/");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.id("UserName")).sendKeys("ilyasyar7@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Ylyas7kanzaki");
	driver.findElement(By.id("lbLogin")).click();
	driver.findElement(By.xpath("//*[@id=\"SiteNavigation\"]/div/ul/li[7]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"SiteNavigation\"]/div/ul/li[7]/ul/li[2]/a")).click();
	System.out.println(driver.getTitle());
	driver.quit();
	
	}
	public static void main(String[] args) { 
		
		FristSeleniumTest obj= new  FristSeleniumTest();
		obj.lanuchBrower();
		
		// TODO Auto-generated method stub

	}

}
