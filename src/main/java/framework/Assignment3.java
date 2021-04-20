package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//open url
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		//launch HOME page
		driver.findElement(By.linkText("HOME")).click();
		
		//go back to previous page
		driver.navigate().back();
		
		//get the title of link "This is a link"
		WebElement title = driver.findElement(By.linkText("This is a link"));
		System.out.println(title.getAttribute("title"));
		
		//enter email in email section
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("abc@test.com");
		
		//click on subscribe button
		driver.findElement(By.xpath("//section[@id=\"text-11\"]/div/form/input[3]")).click();
		
		// enter name
		driver.findElement(By.name("name")).sendKeys("vikram");
		
		//enter email
		driver.findElement(By.name("email")).sendKeys("test1@demo.com");
		
		//enter telephone
		driver.findElement(By.name("telephone")).sendKeys("1234567890");
		
		//enter country
		driver.findElement(By.xpath("//input[@name='country']")).sendKeys("India");
		
		//enter company
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("metacube");
		
		//enter message
		driver.findElement(By.xpath("//textarea[@placeholder='Message']")).sendKeys("good");

		//click submit button
		driver.findElement(By.partialLinkText("Subm")).submit();
		
		
		driver.quit();
	}

}
