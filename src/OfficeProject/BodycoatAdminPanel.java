package OfficeProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BodycoatAdminPanel
{
	 private static final String WebDriverManger = null;
	static
	    {
		 System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (6)/chromedriver");
//	  	 System.setProperty("webdriver.gecko.driver", "/home/active35/Downloads/geckodriver");
	    }
	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
	//	WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://be.bodycoat.in/admin");
		
		
		
		
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		
		WebElement ele = driver.findElement(By.xpath("//a[text()=\"Setting \"]"));
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//a[text()=\"Product & Services\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()=\"Service\"]")).click();
		Thread.sleep(2000);
		
		//new button
		driver.findElement(By.xpath("//a[text()=\"Add New\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"name\"]")).sendKeys("Automation Service Demo");
		Thread.sleep(3000);
		
	//	driver.findElement(By.id("product_category_id")).click();
	//	Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"product_category_id\"]/option[4]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[text()=\"18\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"time_taken_mins\"]")).sendKeys("35");
		Thread.sleep(3000);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		driver.findElement(By.xpath("(//input[@class=\"form-control required \"])[1]")).sendKeys("0");
		Thread.sleep(2000);
		
		
		
       
	/*	driver.switchTo().frame(0);
		//driver.switchTo().frame("{frame name=iframe}");
		driver.findElement(By.xpath("//div[@class=\"cke_1 cke cke_reset cke_chrome cke_editor_editor1 cke_ltr cke_browser_webkit\"]")).sendKeys("Test");
		Thread.sleep(2000);
		
		
		*/
		
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@class=\"cke_wysiwyg_frame cke_reset\"])[4]")));
		 
		
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	driver.close();

	}

}
