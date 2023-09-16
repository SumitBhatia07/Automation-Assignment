package SeleniumPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonAssignment 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Sumit Bhatia PST\\Selenium\\Automation Testing\\Chrome\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//To open the url in browser
	driver.get("https://www.amazon.com");
	System.out.println("Website is opened");
	
	//To maximize the browser
	driver.manage().window().maximize();
	System.out.println("Window is maximized");
	
//	//To solve the captcha	
//	Thread.sleep(10000);
//	System.out.println("System is on standby to enter the captcha manually");
//	
//	//To find the location and to perform the action on that captcha
//	WebElement continueButton = driver.findElement(By.xpath("//button[@class='a-button-text']"));
//	continueButton.click();
//	System.out.println("Captcha is completed and system has moved to main page");
	
	//1. Search a product
	//To enter a particular value in search bar
	WebElement searchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	searchBar.sendKeys("Mobile Phones");
	System.out.println("Value entered in search bar");
	
	//To click on Search Button
	WebElement searchButton = driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
	searchButton.click();
	System.out.println("Search successful");
	
	//2. Filter the product based on price range
	//To select a minimum price range
	WebElement minPriceRange = driver.findElement(By.xpath("//input[@id='low-price']"));
	minPriceRange.sendKeys("125");
	System.out.println("Minimum price range is selected");
	
	//To select a maximum price range
	WebElement maxPriceRange = driver.findElement(By.xpath("//input[@id='high-price']"));
	maxPriceRange.sendKeys("900");
	System.out.println("Maximum price range is selected");
	
	//To hit on GO button
	WebElement goButton = driver.findElement(By.xpath("//input[@class='a-button-input']"));
	goButton.click();
	System.out.println("Go Button clicked");
		
	//3. Adding a product to shopping cart
	//To select a product
	WebElement productSelection = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	productSelection.click();
	System.out.println("Product succesffuly clicked");
	
	//To select add to cart button
	WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	addToCart.click();
	System.out.println("Product successfully added to cart");
	
	//To click on Cart Button	
	WebElement cartButton = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
	cartButton.click();
	System.out.println("Successfully clicked on cart button");
	
	//4. Proceeding to checkout
	//To click on CheckOut Button
	WebElement checkoutButton = driver.findElement(By.xpath("//input[@class='a-button-input']"));
	checkoutButton.click();
	System.out.println("Checkout Button successfully clicked");
	
	//5. Fill Out the checkout form
	//To enter mobile number or email id
	WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='ap_email']"));
	mobileNumber.sendKeys("8796752162");
	System.out.println("Mobile number entered successfully");
	
	//To click on continue button
	WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
	continueButton.click();
	System.out.println("Continue Button clicked");
	
	//To enter password
	WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
	password.sendKeys("Sumit@123");
	System.out.println("Password entered");
	
	//To enter sign in button
	WebElement signinButton = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	signinButton.click();
	System.out.println("Sign in successful");
	
	//Verification sign up
	Thread.sleep(10000);
	System.out.println("System on stand by to enter the otp");
	
	//To click on Submit code button
	WebElement submitCode = driver.findElement(By.xpath("//input[@class='a-button-input']"));
	submitCode.click();
	System.out.println("Code submitted succesfully");
	
	//To click on add credit card button
	WebElement addCreditCard = driver.findElement(By.xpath("//a[@id='pp-SxH3eX-78']"));
	addCreditCard.click();
	System.out.println("Add Credit card button succesfully clicked");
	
	//To enter card number
	WebElement cardNumber = driver.findElement(By.xpath("//input[@id='pp-J4oHIx-17']"));
	cardNumber.sendKeys("1234567890123456");
	System.out.println("Card Number entered succesffuly");
	
	//To enter the name
	WebElement name = driver.findElement(By.xpath("//input[@id='pp-J4oHIx-19']"));
	name.sendKeys("Name");
	System.out.println("Name entered succesffuly");
	
	//To enter expiry date
	WebElement expiryDate = driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']"));
	expiryDate.click();
	Select s = new Select(expiryDate);
	s.selectByIndex(11);
	System.out.println("Expiry date selected");
	
	//To enter CVV number
	WebElement cvvNumber = driver.findElement(By.xpath("//input[@id='pp-J4oHIx-26']"));
	cvvNumber.sendKeys("123");
	System.out.println("CVV Number entered");
	
	//To click on Add Your Card
	WebElement addYourCard = driver.findElement(By.xpath("//input[@class='a-button-input']"));
	addYourCard.click();
	System.out.println("Card Added successfully");
	
	System.out.println("Testing completed");
	
}

}
