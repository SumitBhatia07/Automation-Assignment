package SeleniumPack1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMytRIP 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 System.setProperty("webdriver.chrome.driver", "D:\\Sumit Bhatia PST\\Selenium\\Automation Testing\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.makemytrip.com");
		Thread.sleep(2000);
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Browser is maximized");
		
		WebElement MobileNumber = driver.findElement(By.xpath("//input[@id='username']"));
		MobileNumber.sendKeys("9834107379");
		Thread.sleep(2000);
		System.out.println("Mobile Number is entered");
		
//		WebElement Ad = driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']"));
//		Ad.click();
//		Thread.sleep(2000);
//		System.out.println("Ad closed");
		
		WebElement ContinueButton = driver.findElement(By.xpath("//button[@class='capText font16']"));
		ContinueButton.click();
		Thread.sleep(2000);
		System.out.println("Login succesful");
 }
}
