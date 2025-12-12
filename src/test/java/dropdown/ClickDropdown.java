package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClickDropdown {
	
	WebDriver driver; //making webdriver global
	
	public void dropdownTest() throws InterruptedException {
		driver = new ChromeDriver(); //open browser
		
		driver.manage().window().maximize(); //maximize browser
		
		driver.navigate().to("https://demo.guru99.com/test/newtours/"); //go to URL
		
		driver.findElement(By.xpath("//*[text()='REGISTER']")).click(); //click register
		
		WebElement country0 = driver.findElement(By.name("country")); //select by index in drop-down menu
		Select select0 = new Select(country0);
		select0.selectByIndex(22);
		
		Thread.sleep(2000); //adds a delay to click close button and adds throws exception
		
		WebElement popup = driver.findElement(By.xpath("//*[@class='cb-close']")); //closes pop up
		if(popup.isDisplayed()) {
			popup.click();
		}
		
		Thread.sleep(2000);
		
		WebElement country1 = driver.findElement(By.name("country")); //select by value in drop-down menu
		Select select1 = new Select(country1);
		select1.selectByValue("CHINA");
		
		Thread.sleep(2000); //wait in between selections to visually observe all 3 country selections
		
		WebElement country2 = driver.findElement(By.name("country")); //select by text in drop-down menu
		Select select2 = new Select(country2);
		select2.selectByVisibleText("BANGLADESH");
	}
}
