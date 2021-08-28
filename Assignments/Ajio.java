package week3.Day2.Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement Searchbox = driver.findElement(By.xpath("//input[@placeholder='Search AJIO']"));
		Searchbox.sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();

		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		String ItemsFound = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(" Items Found for Men fashons Bag " + ItemsFound);
		
		List<WebElement> BrandName = driver.findElements(By.xpath("//div[@class='brand']"));
		for (WebElement BrandList : BrandName) {
			
			System.out.println(" List Of Brand Name is :" + BrandList.getText());
		}
		
		
	}

}
