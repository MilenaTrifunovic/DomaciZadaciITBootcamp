package SeleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4 {

	public static void main(String[] args) throws Exception {
		// Napisati program koji ucitava https://practicetestautomation.com/ stranicu, 
		//klikne na "Practice" i klikne na "Test login page", 
		//popunjava username i password (student/Password123), 
		//loguje se na stranicu klikom na dugme Submit 
		//i zatim se odjavljuje klikom na dugme Logout. Na kraju zatvoriti program.

	
System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.navigate().to("https://practicetestautomation.com/");
		
		WebElement practiceDugme= driver.findElement(By.id("menu-item-20"));
		
		practiceDugme.click();
		Thread.sleep(2000);
		WebElement testLoginPage = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[1]/div[1]/p/a"));
		Thread.sleep(2000);
		testLoginPage.click();
		WebElement userName =driver.findElement(By.id("username"));
		Thread.sleep(2000);
	    userName.clear();
	    userName.click();
	    userName.sendKeys("student");
	    
	    WebElement password= driver.findElement(By.id("password"));
	    Thread.sleep(2000);
	    password.clear();
	    password.click();
	    password.sendKeys("Password123");
	    
	    WebElement submitButton = driver.findElement(By.id("submit"));
	    
	    submitButton.click();
	    
	    WebElement logout=driver.findElement(By.cssSelector(".wp-block-button__link.has-text-color.has-background.has-very-dark-gray-background-color"));
	    Thread.sleep(2000);
	    logout.click();
	    
	    driver.close();
	
	}

}
