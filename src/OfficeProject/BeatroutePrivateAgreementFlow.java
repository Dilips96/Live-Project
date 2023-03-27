package OfficeProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BeatroutePrivateAgreementFlow 
{
    static
    {
	 System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver_linux64 (6)/chromedriver");
  //	 System.setProperty("webdriver.gecko.driver", "/home/active35/Downloads/geckodriver");
    }


	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver = new ChromeDriver();
	//	WebDriver driver = new FirefoxDriver();

		driver.get("http://65.0.235.139:3000/search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("(//button[text()=\"Sign in\"])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class=\"form-control\"]")).sendKeys("7978006295");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class=\"custom-btn custom-primary btn btn-primary\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter OTP\"]")).sendKeys("54546");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()=\"Verify OTP\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@class=\"custom-btn custom-white btn btn-default\"])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class=\"custom-btn grey btn btn-default\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter track title\"]")).sendKeys("Test Automation Beat");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Tell us about your process and how you arrived at this track\"]")).sendKeys("This is For the Automation part where the desired data is done by Automatiom");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter BPM\"]")).sendKeys("150");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()=\"Next\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter the price\"]")).sendKeys("1000");
		Thread.sleep(2000);
		
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,800)", "");
		
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,500)", "");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Buyer's name\"]")).sendKeys("Gokul TA");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Phone number\"]")).sendKeys("8220611797");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Buyer's address\"]")).sendKeys("BTM");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Buyer's Email ID\"]")).sendKeys("gokul@active.agency");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Confirm Email ID\"]")).sendKeys("gokul@active.agency");
		Thread.sleep(2000);
		
		

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,300)", "");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,300)", "");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div[2]/form/div[2]/div/div/div/div/label/span")).click();
		Thread.sleep(2000);
		
		
		
		
		
	
		
		Robot rb = new Robot();

		// copying File path to Clipboard
		StringSelection str = new StringSelection("/home/active35/Desktop/Music beats/128_ScuddDrum_01_96_SP.wav");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		driver.findElement(By.xpath("//button[@class=\"custom-btn custom-primary btn btn-primary\"]")).click();
		
		
	/*	
		WebDriverWait wait = new WebDriverWait(driver,null);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=\"Submit\"]"))).click();	
		
		
	*/	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	 this is for inserting the zip file by using robot class
	
		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div[2]/form/div[3]/div/div/div/div/label/span")).click();
		Thread.sleep(2000);
		
		
		
		Robot rbfile = new Robot();
		
		
		StringSelection strfile = new StringSelection("/home/active35/Desktop/Zip file/df47 3.4 .zip");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		
		rbfile.keyPress(KeyEvent.VK_CONTROL);
		rbfile.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rbfile.keyRelease(KeyEvent.VK_CONTROL);
		rbfile.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rbfile.keyPress(KeyEvent.VK_ENTER);
		rbfile.keyRelease(KeyEvent.VK_ENTER); 
		
		
		*/
		
		
		
		
		
		

		
		
		
		
		
	//	driver.close();
		
		
	}

}
