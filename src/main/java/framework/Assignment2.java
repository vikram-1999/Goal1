package framework;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	
		static void chrome() {
			System.setProperty("webdriver.chrome.driver", "H:\\Webdriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			// hit the url
			driver.get("https://demoqa.com/login");
			
			//maximize window size
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			//retrive webpage title
			String title = driver.getTitle();
			System.out.println("Title is : " + title);
			
			//find element
			WebElement userName = driver.findElement(By.id("userName"));
			WebElement password = driver.findElement(By.id("password"));
			WebElement Btnlogin = driver.findElement(By.id("login"));
			
			//perform action on webelement
			userName.sendKeys("TestUser");
			password.sendKeys("test@123");
			Btnlogin.click();
			
			driver.quit();
			
			System.out.println("session end");
		}
		
		static void ie() throws InterruptedException {
			System.setProperty("webdriver.ie.driver", "H:\\Webdriver\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.get("https://www.google.com/");
			String s = driver.getTitle();
			System.out.println("title is : "+ s);
			
			driver.quit();
		}
		
		static void fx() {
			System.setProperty("webdriver.gecko.driver", "H:\\Webdriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
			String s = driver.getTitle();
			System.out.println("title is : "+ s);
			
			driver.quit();
		}
		
		
		public static void main(String[] args) throws InterruptedException {
		
			Assignment2.chrome();
			Assignment2.ie();
			Assignment2.fx();
		}

}
