package domaci.zadatak_0327;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RickAstley {
	//Pomocu jave i selenijuma
	//1) otici na sajt youtube
	//2) u search-u pronaci Rick Astley i pustiti pesmu Never gonna give you up
	// voditi racuna da ako postoje reklame da ih preskocite


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		driver.findElement(By.id("search")).sendKeys("Rick Astley Never gonna give you up");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.linkText("Rick Astley - Never Gonna Give You Up (Video)")).click();
		
//		if (driver.findElement(By.id("ad-text:8")) != null) {
//			driver.findElement(By.id("ad-text:8")).click();
//		}

	}

}
