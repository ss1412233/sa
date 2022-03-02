package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Selenium {

	@Test
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/seyma.sagbas/eclipse-workspaceNew/intro/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/w/index.php?search");

		driver.findElement(By.cssSelector("[title$=\"Search Wikipedia\"]")).sendKeys("Ukraine");
		driver.findElement(By.cssSelector("button[type$=submit]")).click();
		
		WebElement search = driver.findElement(By.cssSelector(".mw-search-exists a"));
		String searchkeyword = search.getText();
		Assert.assertEquals(searchkeyword, "Ukraine");
		
		driver.get("https://en.wikipedia.org/w/index.php?search");
		
	
			}	
		
	}

