package framework;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open url
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		//total input boxes available on the form
		List<WebElement> allInputBox = driver.findElements(By.xpath("//form[contains(@class,'contact')]//input[@type='text']"));
		System.out.println("total input box : " + allInputBox.size());
		
		
		//get current color code
		WebElement chngeColor = driver.findElement(By.id("colorVar"));
		String colorCode = chngeColor.getAttribute("style");
		System.out.println("color code of box is : " + colorCode);
		
		//total number of buttons available on the page
		List<WebElement> allButtons = driver.findElements(By.xpath("(//button)"));
		System.out.println("total number of buttons on page : " + allButtons.size());
		
		// 6th button on page
		String s = driver.findElement(By.xpath("(//button)[6]")).getText();
		System.out.println("text of button 6 is : " + s);
		
		
		//last button on page
		WebElement e = driver.findElement(By.xpath("(//button)[last()]"));
		System.out.println("text of last button is : " + e.getText());
		
		
		// save all links
		List<WebElement> links = driver.findElements(By.xpath("//a"));

			
	for(int i=0;i<links.size();i++) {
		if(links.get(i).getText().equals("Setup First Project")) {
			System.out.println("Node index of Setup First Project link : " + i);
			System.out.println("Text associated with link node next to above : " + links.get(i-1).getText());
		}
		
	}
		
		
		driver.quit();
	}

}
