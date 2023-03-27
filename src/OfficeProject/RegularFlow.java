package OfficeProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegularFlow 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (6)/chromedriver");
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://65.0.235.139:3000/");
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("(//button[text()=\"Sign in\"])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class=\"form-control\"]")).sendKeys("8018862351");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class=\"custom-btn custom-primary btn btn-primary\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder=\"Enter OTP\"]")).sendKeys("54546");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()=\"Verify OTP\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@class=\"custom-btn custom-white btn btn-default\"])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()=\"Regular Beat\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter track title\"]")).sendKeys("Test Regular Automation");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Tell us about your process and how you arrived at this track\"]")).sendKeys("This is to test the Regular flow in Automation");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter BPM\"]")).sendKeys("150");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		
		driver.findElement(By.xpath("//div[text() = \"Select genres\"]")).click();
		Thread.sleep(2000);	
		
		driver.findElement(By.xpath("//div[text() =\"AA\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text()=\"select tags\"]")).click();
		
		Actions action=new Actions(driver);
		action.sendKeys("f").build().perform();
		Thread.sleep(5000);	
		
		Actions action1=new Actions(driver);
		action1.sendKeys(Keys.ENTER).build().perform();

		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class=\"checkmark\"])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class=\"checkmark\"])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class=\"css-bg1rzq-control custom-select__control\"])[2]")).click();
		Thread.sleep(2000);
		
		Actions sample = new Actions(driver);
		sample.sendKeys("50").build().perform();
		Thread.sleep(2000);
		
		Actions Entmo = new Actions(driver);
		Entmo.sendKeys(Keys.ENTER).build().perform();
		
		driver.findElement(By.xpath("(//button[@class=\"custom-btn custom-primary btn btn-primary\"])[2]")).click();
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("(//span[@class=\"checkmark\"])[3]")).click();
		Thread.sleep(2000);
		
		
		
		
	//	driver.findElement(By.xpath("")).click();
	//	Thread.sleep(2000);
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		

	}

}




























