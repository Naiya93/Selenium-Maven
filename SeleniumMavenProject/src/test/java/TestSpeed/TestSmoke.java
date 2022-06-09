package TestSpeed;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSmoke {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		chrome();
		Runtest();
	}
	
	
	
	public static void chrome() {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
	}
	
	public static void Runtest()   {

		driver.get("https://app.tryspeed.dev/login");

		if(driver.getPageSource().contains("Sign in to your account")) 
		{
			System.out.println("Text Present");
			System.out.println(driver.getTitle());
			WebElement email=driver.findElement(By.xpath("//input[@placeholder='john@example.com']"));
			email.sendKeys("naiya@tryspeed.com");

			driver.findElement(By.xpath("//button[@id='mui-1']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			WebElement password=driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
			password.sendKeys("Test@123");
			driver.findElement(By.xpath("//button[@id='mui-2']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.getPageSource().contains("Dashboard");			
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/nav[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/nav[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/div[1]")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/nav[1]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]/div[1]")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/nav[1]/div[1]/div[1]/div[1]/div[5]/ul[1]/li[1]/div[1]")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/nav[1]/div[1]/div[1]/div[1]/div[6]/ul[1]/li[1]/div[1]")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/nav[1]/div[1]/div[1]/div[1]/div[7]/ul[1]/li[1]/div[1]")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/header[1]/div[1]/div[3]/div[3]/div[1]/img[1]")).click();
			//driver.wait(30);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//li[normalize-space()='Logout']")).click();
		}
		else {
			System.out.println("Error: Text not Present");
			driver.quit();
		}
}}
