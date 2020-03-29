package domaci2020_03_09;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_2_0309 {
	static WebDriver wd = new ChromeDriver();
	
	public static void takeScreenshot() throws IOException {
		
		
		
		String fileName = RandomStringUtils.randomAlphabetic(10) + ".png";
		String directory = "C:\\Users\\ika\\Desktop\\";
		
		File sourceFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File (directory + fileName));
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
//		Koristeci selenijum, napravi screenshot strane po izboru.
//		Okaciti ovaj zadatak i kao .java (kod sa selenijumom) i sliku(screenshot).
		
		
		
		wd.get("https://www.youtube.com/");
		
		wd.manage().window().maximize();
		
		wd.findElement(By.id("search")).sendKeys("IT Bootcamp");
		
		wd.findElement(By.id("search-icon-legacy")).click();
		
		Thread.sleep(3000);
		
		takeScreenshot();
		
		wd.close();
		
		
		
		
		

	}

}
