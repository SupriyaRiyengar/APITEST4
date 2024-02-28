package testNGbasicsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class RegisterTestPractice {
	@Test(groups = "suma")
	public void register() {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Xyz");
		driver.findElement(By.id("LastName")).sendKeys("xyz");
		driver.findElement(By.id("Email")).sendKeys("supmrs@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("xyz@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("xyz@123");
		driver.findElement(By.id("register-button")).click();

	}

}
