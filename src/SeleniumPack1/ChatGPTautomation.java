package SeleniumPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChatGPTautomation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Sumit Bhatia PST\\Selenium\\Automation Testing\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://chat.openai.com");
		Thread.sleep(500);
		System.out.println("Browser has opened");
		
		
		driver.manage().window().maximize();
		Thread.sleep(500);
		System.out.println("Browser maximized");
		
		WebElement LoginButton = driver.findElement(By.xpath("//button[@class='relative flex h-12 items-center justify-center rounded-md text-center text-base font-medium bg-[#3C46FF] text-[#fff] hover:bg-[#0000FF]']"));
		LoginButton.click();
		System.out.println("Login Button successfully clicked");
}
}