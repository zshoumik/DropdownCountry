package looping;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Looping {

	public static void main(String[] args){
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		List<WebElement> menubar=driver.findElements(By.xpath("//*[@class='nav navbar-nav']//a"));

		System.out.println(menubar.size());
				
		for(int i=0;i<menubar.size();i++) {
			System.out.println(menubar.get(i).getText());
		}
	}
}
