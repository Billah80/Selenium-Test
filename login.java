package automationclass;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class login {

	public static void main(String[] args) throws InterruptedException {

		//Driver Initialization
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//Window & Link
				driver.get("https://trytestingthis.netlify.app/");
				driver.manage().window().maximize();
		
		//FN & LN
				driver.findElement(By.id("fname")).sendKeys("Tamim");
				driver.findElement(By.id("lname")).sendKeys("Billah");
				
		//RadioButton
				WebElement radiobutton = driver.findElement(By.id("male"));
				radiobutton.click();
				assert radiobutton.isSelected();
				System.out.println(radiobutton.isSelected());
				

		//Dropdown
				WebElement testDropdown = driver.findElement(By.id("option"));
				Select dropdown = new Select(testDropdown);
				dropdown.selectByIndex(2);
				
		//Checklist
				WebElement checkbox1= driver.findElement(By.name("option2"));
				checkbox1.click();
				WebElement checkbox2= driver.findElement(By.name("option3"));
				checkbox2.click();
				
		//Add Picture
				WebElement chooseFile = driver.findElement(By.id("myfile"));
				chooseFile.sendKeys("C:\\Users\\ainan\\OneDrive\\Desktop\\My DP.jpg");
				Thread.sleep(3000);
		//Submit
				driver.findElement(By.className("btn-success")).click();
	}

}
