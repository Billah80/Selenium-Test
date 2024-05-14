package automationclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		
		//Driver Initialization
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//Window & Link
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//login
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[1]")).click();
		Thread.sleep(3000);
		
		//Add to Cart
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div[2]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(3000);
		
		//Checkout
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.id("first-name")).sendKeys("Tamim");
		Thread.sleep(3000);
		driver.findElement(By.id("last-name")).sendKeys("Billah");
		Thread.sleep(3000);
		driver.findElement(By.id("postal-code")).sendKeys("4203");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[9]/button[2]")).click();
		Thread.sleep(3000);
	}

}
