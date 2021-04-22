package frameworkdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6_q5 {
	
	WebDriver driver;
	
	@BeforeMethod
    public void setUp() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
	
	@Test
	public void homePage() {
		String pageLink = driver.getCurrentUrl();
		System.out.println(pageLink);
		String txt = driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']")).getText();
		WebElement logo = driver.findElement(By.xpath("//img[@alt='My Store']"));
		logo.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String cuurrentPageLink = driver.getCurrentUrl();
		String txt1 =driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']")).getText();
		System.out.println(cuurrentPageLink);
		
		Assert.assertEquals(txt1, txt,"Home page is not rendered on clicking ‘Your Logo’");

	}
	
	@Test
	public void contactUsPage() {
		String contactUsLink = "http://automationpractice.com/index.php?controller=contact";
		driver.findElement(By.linkText("Contact us")).click();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, contactUsLink,"Clicking on Contact us not rendered user to Contact Us Page");
	}
	
	@Test
	public void search() {
		driver.findElement(By.id("search_query_top")).sendKeys("‘ABCDEFGH’");
		driver.findElement(By.name("submit_search")).click();
		String expectedResult = "No results were found for your search \"‘ABCDEFGH’\"";
		String actualResult = driver.findElement(By.xpath("//div[@id='center_column']//p")).getText();

		Assert.assertEquals(actualResult, expectedResult);
		
		
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
