package SeleniumOsnove;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium9 {

	public static void main(String[] args) throws Exception {
		/* Otvoriti novi prozor u pretrazivacu i otici na stranicu  IT Bootcamp-a
Primeniti metode- get URL i Title, navigate - refresh, to, back, forward
U kodu treba da se prozor maksimizuje, a pre zatvaranja drajvera vrati na prvobitnu velicinu (hint: koristite smernice okruzenja, ako to ne pomaze, guglajte =) )
Dokazati da li prilikom koriscenja reci “testiranje” u search-u (i trazanja jelte) dobijamo rezultat shodno trazenom tako sto cete napraviti screenshot stranice. nakon pretrage.
Proveriti da li bilo koje dugme (proizvoljno) radi i odvodi vas na zeljenu stranicu. */

System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://itbootcamp.rs/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.cssSelector(".fa.fa-search"));
		search.click();
		//
		
		WebElement poljeZaUnos= driver.findElement(By.className("form-control"));
		
		WebDriverWait wdwait = new WebDriverWait (driver,25);
		wdwait.until(ExpectedConditions.elementToBeClickable(By.className("form-control")));
		poljeZaUnos.clear();
		poljeZaUnos.click();
		poljeZaUnos.sendKeys("testiranje");
		poljeZaUnos.sendKeys(Keys.ENTER);
		
		scrShot (driver,"C:/Users/Jeca/eclipse-workspace/Selenium/src/SeleniumOsnove/src.png" );
		
		
		
		WebElement donacije= driver.findElement(By.xpath("//*[@id=\"menu-item-6402\"]/a"));
		Thread.sleep(2000);
		donacije.click();
		
		
		String ispravanTekst="Donacije";
		
		
		WebElement tesktNaStranici=driver.findElement(By.className("entry-title"));
		String dobijeniTekst=tesktNaStranici.getText();
		
		if (dobijeniTekst.equalsIgnoreCase(ispravanTekst)) {System.out.println("Otvara se prava stranica");}
		else {System.out.println("Ne otvara se prava stranica");}
		
	
	
	
	
	
	}

	private static void scrShot(WebDriver driver, String filePath) throws Exception {
		// TODO Auto-generated method stub
		
		TakesScreenshot shot = ((TakesScreenshot) driver);
		File SrcFile = shot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(filePath);
		FileUtils.copyFile(SrcFile, DestFile);
		
	
	
	
	}

	

}
