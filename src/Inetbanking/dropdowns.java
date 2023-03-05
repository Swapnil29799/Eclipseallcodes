package Inetbanking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdricer.chrome.driver", "E:\\\\Eclipse\\\\chrome\\\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		WebElement selectdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		
//		Select dropdown = new Select(selectdropdown);
//		dropdown.selectByIndex(3);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//       // driver.close();
//        dropdown.selectByVisibleText("AED");
//        System.out.println(dropdown.getFirstSelectedOption().getText());
//        dropdown.selectByValue("INR");
//        System.out.println(dropdown.getFirstSelectedOption().getText());
//        driver.close();
		int n = 5;

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
//		while (i < n) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//
//		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<n;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			//i++;
			
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.close();
		
		

	}

}
