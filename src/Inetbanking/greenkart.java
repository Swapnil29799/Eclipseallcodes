package Inetbanking;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class greenkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.crome.driver", "E:\\Eclipse\\chrome\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		//WebDriver driver;
		//WebDriverWait w = new WebDriverWait(driver, 5);
		
		String[] items = {"Brocolli" , "Cucumber"};
		
		
		List<String> itemneeded = Arrays.asList(items);

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		int j=0;
		
		for (int i = 0; i < products.size(); i++) 
		{
			
			String[] name = products.get(i).getText().split("-");
			String trimname = name[0].trim();
			
			
			if (itemneeded.contains(trimname))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//Thread.sleep(2000);
				if(j==itemneeded.size())
					break;
			}
			
		}
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		System.out.println(driver.findElement(By.xpath("//li[@class='cart-item']")).getText());
		
		
		driver.close();
	}

}

