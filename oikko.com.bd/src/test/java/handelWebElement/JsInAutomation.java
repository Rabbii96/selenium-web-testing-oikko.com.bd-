package handelWebElement;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import utilities.driverSetUp;

public class JsInAutomation extends driverSetUp{

	@Test
	private void scrollUsingJs() throws InterruptedException {
		driver.get("https://frontend-oikko-com-bd-2zuc.vercel.app/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(4000);
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
		Thread.sleep(4000);
		WebElement Women_collection = driver.findElement(By.xpath("//section[3]//div[1]//div[1]//div[1]//h2[1]"));
		js.executeScript("arguments[0].scrollIntoView();", Women_collection);
		Thread.sleep(4000);
	}
	
	@Test
	public void testWait() {
		driver.get("https://qavbox.github.io/demo/alerts/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement btn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("delayalert")));
		btn.click();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		assertEquals(alert.getText(), "I appeared after 5 seconds!");
		alert.accept();
	}
}
