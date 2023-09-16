package SeleniumPack1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Sumit Bhatia PST\\Selenium\\Automation Testing\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.saucedemo.com");
		Thread.sleep(500);
		System.out.println("Browser has opened");
		
		
		driver.manage().window().maximize();
		Thread.sleep(500);
		System.out.println("Browser maximized");
		
							
	WebElement Username = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
	Username.sendKeys("standard_user");
	System.out.println("User Name entered");
	Thread.sleep(500);
	
	WebElement Password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
	Password.sendKeys("secret_sauce");
	System.out.println("Password entered");
	Thread.sleep(500);
	
	WebElement LoginButton = driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
	LoginButton.click();
	System.out.println("Login succesfully");
	Thread.sleep(500);
	
	WebElement BagSelection = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
	BagSelection.click();
	System.out.println("Bag is selected");
	Thread.sleep(500);
	
	WebElement AddToCart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
	AddToCart.click();
	System.out.println("Bag added to cart");
	Thread.sleep(500);
	
	WebElement Cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	Cart.click();
	System.out.println("Moved to cart");
	Thread.sleep(500);
	
	WebElement Checkout = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']"));
	Checkout.click();
	System.out.println("Moved to payment");
	Thread.sleep(500);
	
	WebElement firstname = driver.findElement(By.xpath("//input[@id='first-name']"));
	firstname.sendKeys("Manas");
	System.out.println("First Name entered");
	Thread.sleep(500);
	
	WebElement lastname = driver.findElement(By.xpath("//input[@id='last-name']"));
	lastname.sendKeys("Kumar");
	System.out.println("Last name entered");
	Thread.sleep(500);
	
	WebElement zip = driver.findElement(By.xpath("//input[@id='postal-code']"));
	zip.sendKeys("110077");
	System.out.println("Zip entered");
	Thread.sleep(500);
	
	WebElement ContinueButton = driver.findElement(By.xpath("//input[@class='submit-button btn btn_primary cart_button btn_action']"));
	ContinueButton.click();
	System.out.println("Order cnfirmed");
	Thread.sleep(500);
	
	WebElement Finish = driver.findElement(By.xpath("//button[@id='finish']"));
	Finish.click();
	System.out.println("Order placed succesffuly");
	Thread.sleep(500);
	
	WebElement MenuButton = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
	MenuButton.click();
	System.out.println("Menu Button clicked");
	Thread.sleep(500);
	
	WebElement Logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
	Logout.click();
	System.out.println("Logout successful");
	Thread.sleep(500);
		
	driver.close();
	System.out.println("Browser closed succesfully");
	
	System.out.println("Testing is completed");
	}
}
