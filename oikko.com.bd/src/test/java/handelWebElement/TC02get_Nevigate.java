package handelWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import utilities.driverSetUp;

public class TC02get_Nevigate extends driverSetUp{
	
public String base_url="https://frontend-oikko-com-bd-2zuc.vercel.app/";

@Test
public void nevigateToWebpage() throws InterruptedException {
	
	
	driver.get(base_url);
	driver.navigate().to("https://frontend-oikko-com-bd-2zuc.vercel.app/ready-to-ship");
	driver.navigate().back();
	Thread.sleep(300);
	driver.navigate().forward();
	Thread.sleep(300);
	driver.navigate().refresh();
	Thread.sleep(300);
}
@Test
public void handelBrowserWindow() throws InterruptedException {
	driver.get(base_url);
	/*Thread.sleep(3000);
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://seller-oikko-com-bd.vercel.app/");
	Thread.sleep(3000);*/
	driver.findElement(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1) > span:nth-child(1)")).click();
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	System.out.println(driver.getWindowHandles());
	
}

}
