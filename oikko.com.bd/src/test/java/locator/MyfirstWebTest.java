package locator;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.driverSetUp;

public class MyfirstWebTest extends driverSetUp {

	@Test
	public void testWebPageTitle() throws InterruptedException {
		
		driver.get("https://frontend-oikko-com-bd-2zuc.vercel.app/");
		System.out.println(driver.getTitle());
	}
	@Test
	public void testreadytoship() throws InterruptedException {
		
		driver.get("https://frontend-oikko-com-bd-2zuc.vercel.app/");
		WebElement readytoship =driver.findElement(By.xpath("//body/div[@id='__next']/div[@class='header']/div[@class='header_bottom']/div[@class='container']/div[@class='header_bottom_wrapper']/nav[@class='nav']/ul[@role='list']/li[2]/a[1]"));
		System.out.println(readytoship.getText());
		
		
	}
	@Test
	public void testEntrepreneur() throws InterruptedException {
		
		driver.get("https://frontend-oikko-com-bd-2zuc.vercel.app/");
		WebElement Entrepreneur =driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > nav:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"));
		System.out.println(Entrepreneur.getText());
		
		
		
	}
	@Test
	public void testBlog() throws InterruptedException {
		
		driver.get("https://frontend-oikko-com-bd-2zuc.vercel.app/");
		WebElement Blog =driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > nav:nth-child(2) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)"));
		System.out.println(Blog.getText());
		
		
	}
	@Test
	public void testAboutus() throws InterruptedException {
		
		driver.get("https://frontend-oikko-com-bd-2zuc.vercel.app/");
		WebElement Aboutus =driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > nav:nth-child(2) > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)"));
		System.out.println(Aboutus.getText());
		
		
	}
	
	@Test
	public void testContactus() throws InterruptedException {
		driver.get("https://frontend-oikko-com-bd-2zuc.vercel.app/");
		WebElement Contactus =driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > nav:nth-child(2) > ul:nth-child(1) > li:nth-child(6) > a:nth-child(1)"));
		System.out.println(Contactus.getText());
		
	}
	@Test
	public void testSearchinput() throws InterruptedException {
		
		driver.get("https://frontend-oikko-com-bd-2zuc.vercel.app/");
		WebElement Searchinput =driver.findElement(By.cssSelector("input[placeholder='Search in Oikko']"));
		Searchinput.sendKeys("pant");
		WebElement Search_button =driver.findElement(By.xpath("//div[@class='search-icon-box']//*[name()='svg']"));
		Search_button.click();
	}
	@Test
	public void category() throws InterruptedException {
		driver.get("https://frontend-oikko-com-bd-2zuc.vercel.app/");
		WebElement category =driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > nav:nth-child(2) > ul:nth-child(1) > li:nth-child(6) > a:nth-child(1)"));
		System.out.println(category.getText());
		
	}
	@Test
	public void Support_Center() throws InterruptedException {
		driver.get("https://frontend-oikko-com-bd-2zuc.vercel.app/");
		WebElement Support_Center =driver.findElement(By.cssSelector("div[class='customTooltip support hover'] div[class='tooltip_title'] span"));
		System.out.println(Support_Center.getText());
		
		
		
	}
	@Test
	public void Live_Chat() throws InterruptedException {
		driver.get("https://frontend-oikko-com-bd-2zuc.vercel.app/");
	WebElement Live_Chat =driver.findElement(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(3) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > span:nth-child(2)"));
	System.out.println(Live_Chat.getText());
}
}
