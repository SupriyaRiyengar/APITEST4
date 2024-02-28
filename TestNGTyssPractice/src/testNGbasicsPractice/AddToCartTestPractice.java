package testNGbasicsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddToCartTestPractice {

	//@Test(groups = "supriya")
	public void addToCart() {
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("supmrs@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("xyz@123");
		driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();

		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.xpath("//a[text()='Fiction']/ancestor::div[@class='details']/descendant::input[@value=\"Add to cart\"]")).click();

	}

}
