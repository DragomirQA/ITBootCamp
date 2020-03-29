package domaci2;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Napraviti testNG klasu koja ce testirati da li se zeljena web stranica otvorila. 
//Proveru izvrsiti na osnovu Title-a.


public class Zadatak_1_0316 {
	WebDriver wd = new ChromeDriver();

	@BeforeClass
	public void beforeClass() {

		wd.manage().window().maximize();
	}

	@Test
	public void verifyPageUrl() {
		String expectedUrl = "https://itbootcamp.rs/";
		wd.get(expectedUrl);

		String actualUrl = wd.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
	}
	
	@Test
	public void verifyTitle() {
		String expectedTitle = "ITBootcamp - Besplatna IT prekvalifikacija - Free IT Bootcamp in cooperation with the Divac Foundation";
		String actualTitle = wd.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
	
	}

	@AfterClass
	public void afterClass() {
		
		wd.close();
	}

}
