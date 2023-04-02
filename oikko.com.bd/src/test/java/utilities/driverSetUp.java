package utilities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverSetUp {
	public WebDriver driver;
	
	@BeforeSuite
	public void SetDriver() throws InterruptedException {
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
	@AfterSuite
	public void quitDriver() {
		driver.quit();
	}

}
