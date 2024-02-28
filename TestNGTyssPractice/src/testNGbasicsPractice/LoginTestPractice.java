package testNGbasicsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestPractice {
    @Test(groups = "supriya")
	public void login() {
	

		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("supmrs@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("xyz@123");
		driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();

	}

}
