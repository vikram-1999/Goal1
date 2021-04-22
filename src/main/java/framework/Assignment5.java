package framework;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment5 {
	

	static void clickOnLinkElement8(WebDriver driver) throws InterruptedException {
		
		// open url
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		// click on link Element8
		driver.findElement(By.linkText("Element8")).click();
		Thread.sleep(3000);
		driver.quit();
	}

	static void practiceForm(WebDriver driver) throws InterruptedException {
		
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 //first name
		WebElement fName = driver.findElement(By.id("firstName"));
		fName.sendKeys("Vikram");

		// last name
		WebElement lName = driver.findElement(By.id("lastName"));
		lName.sendKeys("Singh");

		// email
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("abc@demo.com");	

		//radio button
		WebElement element = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// mobile number
		WebElement number = driver.findElement(By.id("userNumber"));
		number.sendKeys("1234567890");
		
		//check box
		WebElement cb = driver.findElement(By.id("hobbies-checkbox-1"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", cb);
		
		WebElement cb1 = driver.findElement(By.id("hobbies-checkbox-3"));
		js.executeScript("arguments[0].click();", cb1);
		
		//upload file
		WebElement uploadFile = driver.findElement(By.id("uploadPicture"));
		uploadFile.sendKeys("C:\\Users\\DELL\\Desktop\\My folder\\test.txt");
		
		//current address
		WebElement address = driver.findElement(By.id("currentAddress"));
		address.sendKeys("India gate , jaipur");
		
		WebElement svg = driver.findElement(By.xpath("//div[@id='state']//*[local-name()='svg']"));
		svg.click();
		
	//	driver.findElement(By.id("submit")).submit();
		
	//	driver.findElement(By.id("closeLargeModal")).click();
		
	}

	static void webTableHandling(WebDriver driver) throws InterruptedException {
		
		
		// hit the url
		driver.get("https://money.rediff.com/gainers/bse/daily");
		Thread.sleep(3000);

		// driver.findElement(By.cssSelector("div[class='curLink tabs']"));

		// row
		List<WebElement> row = driver.findElements(By.xpath("//div[@id=\"leftcontainer\"]/table/tbody/tr"));
		int r = row.size();

		// col
		List<WebElement> col = driver.findElements(By.xpath("//div[@id=\"leftcontainer\"]/table/tbody/tr[1]/td"));
		int c = col.size();

		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= c; j++) {
				String e = driver
						.findElement(By.xpath("//div[@id=\"leftcontainer\"]/table/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.print(e + "   ");
			}
			System.out.println();
			if (i == 10)
				break;
		}
		Thread.sleep(3000);

		// bottom------------------------

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("------------------------------------");

		driver.findElement(By.xpath("//div[@id=\"leftcontainer\"]/div[3]/div[2]/a")).click();

		List<WebElement> b = driver.findElements(By.xpath("//div[@id=\"leftcontainer\"]/table/tbody/tr"));
		int r1 = b.size();

		List<WebElement> d = driver.findElements(By.xpath("//div[@id=\"leftcontainer\"]/table/tbody/tr[1]/td"));
		int c2 = d.size();

		for (int i = r1 - 9; i <= r1; i++) {
			for (int j = 1; j <= c2; j++) {
				String e = driver
						.findElement(By.xpath("//div[@id=\"leftcontainer\"]/table/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.print(e + "   ");
			}
			System.out.println();

		}

	}
	
	static void closeBrowser(WebDriver driver) {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		Assignment5.clickOnLinkElement8(driver);
		Assignment5.practiceForm(driver);
//		Assignment5. webTableHandling(driver);
	//	Assignment5.closeBrowser(driver);

	}

}
