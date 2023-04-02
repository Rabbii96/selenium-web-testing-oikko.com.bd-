package handelWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utilities.driverSetUp;

public class TC05_Action extends driverSetUp{
	
	@Test
	public void Women_Fashion() throws InterruptedException {
		driver.get("https://frontend-oikko-com-bd-2zuc.vercel.app/");
		Actions actions = new Actions(driver);
		WebElement list01 = driver.findElement(By.xpath("//li[1]//div[1]//div[2]"));
		actions.clickAndHold(list01).build().perform();
		
		
		actions.clickAndHold(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))).build().perform();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
		
		Thread.sleep(6000);
		
	}

	@Test
	public void Men_Fashion() throws InterruptedException {
		driver.get("https://frontend-oikko-com-bd-2zuc.vercel.app/");
		Actions actions = new Actions(driver);
		WebElement list01 = driver.findElement(By.xpath("//li[1]//div[1]//div[2]"));
		actions.clickAndHold(list01).build().perform();
		
		
		actions.clickAndHold(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]"))).build().perform();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		
		Thread.sleep(6000);
		
	}
	
	@Test
	public void Baby_kids_Fashion() throws InterruptedException {
		driver.get("https://frontend-oikko-com-bd-2zuc.vercel.app/");
		Actions actions = new Actions(driver);
		WebElement list01 = driver.findElement(By.xpath("//div[contains(text(),'Baby & Kids Fashion')]"));
		actions.clickAndHold(list01).build().perform();
		
		
		actions.clickAndHold(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]"))).build().perform();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[4]/a[1]")).click();
		
		Thread.sleep(6000);
		
	}
	
	@Test
	public void Food_Grocery() throws InterruptedException {
		driver.get("https://frontend-oikko-com-bd-2zuc.vercel.app/");
		Actions actions = new Actions(driver);
		WebElement list01 = driver.findElement(By.xpath("//div[contains(text(),'Food & Grocery Items')]"));
		actions.clickAndHold(list01).build().perform();
		
		
		actions.clickAndHold(driver.findElement(By.xpath("//a[normalize-space()='Bread & Bakery']"))).build().perform();
		
		driver.findElement(By.xpath("//a[normalize-space()='Bread']")).click();
		
		Thread.sleep(6000);
		
		//actions.moveToElement(driver.findElement(By.xpath("//h5[normalize-space()='High Quality Selection']"))).build().perform();
		//Thread.sleep(6000);
		
		actions.scrollToElement(driver.findElement(By.xpath("//h5[normalize-space()='High Quality Selection']"))).build().perform();
		Thread.sleep(6000);
	}
}
