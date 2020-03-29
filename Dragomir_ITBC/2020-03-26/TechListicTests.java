package domaci.zadatak_0326.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import domaci.zadatak_0326.objs.TechListicObjs;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TechListicTests {
	
	private static WebDriver driver;
	  SoftAssert sa = new SoftAssert ();
	
  @BeforeClass
  public void createDriver() {
	  //System.setProperty("webdriver.chome.driver", "chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get(TechListicObjs.URL);
	  //TechListicObjs t = new TechListicObjs();

	  }
  
  @Test (priority = 0)
  public void verifyFirstNameField () {
	  Assert.assertTrue(TechListicObjs.firstNameField(driver).isDisplayed());
  }
  
  @Test (priority = 1)
  public void tc01() {
	  TechListicObjs.inputFirstName(driver, "Dragomir");
	  TechListicObjs.inputLastName(driver, "Ilic");
	  TechListicObjs.checkGenderM(driver);
	  TechListicObjs.checkYearsOfExperience1(driver);
	  TechListicObjs.inputDate(driver, "03/28/2020");
	  TechListicObjs.checkProfessionManualTester(driver);
	  TechListicObjs.checkAutomationToolsUFT(driver);
	  TechListicObjs.checkAutomationToolsProtractor(driver);
	  TechListicObjs.checkAutomationToolsSeleniumWebdriver(driver);
	  TechListicObjs.selectAsia(driver);
	  TechListicObjs.selectBrowserCommands(driver);
	  //TechListicObjs.uploadImage(driver);
	  //driver.close();
	  TechListicObjs.downloadFile(driver);
	  driver.navigate().back();
	  TechListicObjs.clickButton(driver);
  }
  
  @Test (priority = 2)
  public void tc02() {
	  TechListicObjs.firstNameField(driver).clear();
	  TechListicObjs.inputFirstName(driver, "Rasa");
	  TechListicObjs.inputLastName(driver, "Ilic");
	  TechListicObjs.checkGenderM(driver);
	  TechListicObjs.checkYearsOfExperience7(driver);
	  TechListicObjs.inputDate(driver, "03/28/2015");
	  TechListicObjs.checkProfessionAutomationTester(driver);
	  TechListicObjs.checkAutomationToolsSeleniumWebdriver(driver);
	  TechListicObjs.selectAustralia(driver);
	  TechListicObjs.selectWaitCommands(driver);
	  //TechListicObjs.uploadImage(driver);
	  //driver.close();
	  TechListicObjs.downloadFile(driver);
	  driver.navigate().back();
	  TechListicObjs.clickButton(driver);
  }

  @AfterClass
  public void afterTest() {
	  driver.close();
  }

}
