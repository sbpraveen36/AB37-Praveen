package autoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProgram {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=17791911158547305709&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062009&hvtargid=kwd-10573980&hydadcr=14453_2371562");
		driver.findElement(By.id("searchDropdownBox")).click();
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Software book");
		driver.findElement(By.id("nav-search-submit-button")).click();

		
	}

}
