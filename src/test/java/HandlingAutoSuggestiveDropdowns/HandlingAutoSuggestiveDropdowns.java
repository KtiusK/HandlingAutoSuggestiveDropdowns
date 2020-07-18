package HandlingAutoSuggestiveDropdowns;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestiveDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Test
	public void test() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Katiusca\\MiscelaneosSelenium\\HandlingAutoSuggestiveDropdowns\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.avianca.com/co/es/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement source=driver.findElement(By.xpath("//input[@name='pbOrigen_1_1262040132']"));
	source.clear();
	Thread.sleep(2000);
	source.sendKeys("Bogotá");
	source.sendKeys(Keys.ARROW_DOWN);
	source.sendKeys(Keys.ENTER);
	
	//El elemento es dinámico y cambia mucho el id 
	WebElement destination=driver.findElement(By.id("pbDestino_1_1939495600"));
	destination.clear();
	destination.sendKeys("Seattle");
	Thread.sleep(2000);
	destination.sendKeys(Keys.ARROW_DOWN);
	destination.sendKeys(Keys.ENTER);

}
}


