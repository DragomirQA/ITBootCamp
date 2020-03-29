package domaci.zadatak_0326.objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TechListicObjs {
	WebDriver driver;
//	Koristeci Selenium webdriver otici na sajt https://www.techlistic.com/p/selenium-practice-form.html 
//	i popuniti formu (idealno celu, ako ne ide onda probati bar do kontinenta)
//	Potruditi se da se koristi vise lokatora za pronalazenje elemenata.

	
	public static String URL = "https://www.techlistic.com/p/selenium-practice-form.html";
	public static String FIRST_NAME_NAME = "firstname";
	public static String LAST_NAME_NAME = "lastname";
	public static String GENDER_M_ID = "sex-0";
	public static String GENDER_F_ID = "sex-1";
	public static String YOE_1_ID = "exp-0";
	public static String YOE_2_ID = "exp-1";
	public static String YOE_3_ID = "exp-2";
	public static String YOE_4_ID = "exp-3";
	public static String YOE_5_ID = "exp-4";
	public static String YOE_6_ID = "exp-5";
	public static String YOE_7_ID = "exp-6";
	public static String DATE_XPATH = "//input[@id='datepicker']";
	public static String PROFESSION_M_T_XPATH = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[22]/input[1]";
	public static String PROFESSION_A_T_XPATH = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[22]/input[2]";
	public static String AUTOMATION_TOOLS_UFT_XPATH = "//input[@id='tool-0']";
	public static String AUTOMATION_TOOLS_PROTRACTOR_XPATH = "//input[@id='tool-1']";
	public static String AUTOMATION_TOOLS_SELENIUM_WD_XPATH = "//input[@id='tool-2']";
	public static String CONTINENTS_ASIA_ID = "continents";
	public static String SELENIUM_COMMANDS_BROWSER_ID = "selenium_commands";
	public static String UPLOAD_IMAGE_XPATH = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[30]/div[2]/input[1]";
	public static String DOWNLOAD_FILE_LINK_LINKTEXT = "Click here to Download File";
	public static String BUTTON_NAME = "submit";
	
	
	public static void inputFirstName(WebDriver driver, String firstname) {
		WebElement element = driver.findElement(By.name(FIRST_NAME_NAME));
		element.sendKeys(firstname);
	}
	
	public static  WebElement firstNameField (WebDriver driver) {
		WebElement element = driver.findElement(By.name(FIRST_NAME_NAME));
		return element;
	}
	
	public static void inputLastName(WebDriver driver, String lastname) {
		WebElement element = driver.findElement(By.name(LAST_NAME_NAME));
		element.sendKeys(lastname);
	}
	
	public static void checkGenderM(WebDriver driver) {
		WebElement element = driver.findElement(By.id(GENDER_M_ID));
		element.click();
	}
	
	public static void checkGenderF(WebDriver driver) {
		WebElement element = driver.findElement(By.id(GENDER_F_ID));
		element.click();
	}
	
	public static void checkYearsOfExperience1(WebDriver driver) {
		WebElement element = driver.findElement(By.id(YOE_1_ID));
		element.click();
	}
	
	public static void checkYearsOfExperience2(WebDriver driver) {
		WebElement element = driver.findElement(By.id(YOE_2_ID));
		element.click();
	}
	
	public static void checkYearsOfExperience3(WebDriver driver) {
		WebElement element = driver.findElement(By.id(YOE_3_ID));
		element.click();
	}
	
	public static void checkYearsOfExperience4(WebDriver driver) {
		WebElement element = driver.findElement(By.id(YOE_4_ID));
		element.click();
	}
	
	public static void checkYearsOfExperience5(WebDriver driver) {
		WebElement element = driver.findElement(By.id(YOE_5_ID));
		element.click();
	}
	
	public static void checkYearsOfExperience6(WebDriver driver) {
		WebElement element = driver.findElement(By.id(YOE_6_ID));
		element.click();
	}
	
	public static void checkYearsOfExperience7(WebDriver driver) {
		WebElement element = driver.findElement(By.id(YOE_7_ID));
		element.click();
	}
	
	public static void inputDate(WebDriver driver, String date) {
		WebElement element = driver.findElement(By.xpath(DATE_XPATH));
		element.sendKeys(date);
	}
	
	public static void checkProfessionManualTester(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(PROFESSION_M_T_XPATH));
		element.click();
	}
	
	public static void checkProfessionAutomationTester(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(PROFESSION_A_T_XPATH));
		element.click();
	}
	
	public static void checkAutomationToolsUFT(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(AUTOMATION_TOOLS_UFT_XPATH));
		element.click();
	}
	
	public static void checkAutomationToolsProtractor(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(AUTOMATION_TOOLS_SELENIUM_WD_XPATH));
		element.click();
	}
	
	public static void checkAutomationToolsSeleniumWebdriver(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(AUTOMATION_TOOLS_UFT_XPATH));
		element.click();
	}
	
	public static void selectAsia(WebDriver driver) {
		WebElement element = driver.findElement(By.id(CONTINENTS_ASIA_ID));
		Select sel = new Select(element);
		sel.selectByIndex(0);
	}
	
	public static void selectEurope(WebDriver driver) {
		WebElement element = driver.findElement(By.id(CONTINENTS_ASIA_ID));
		Select sel = new Select(element);
		sel.selectByIndex(1);
	}
	
	public static void selectAfrica(WebDriver driver) {
		WebElement element = driver.findElement(By.id(CONTINENTS_ASIA_ID));
		Select sel = new Select(element);
		sel.selectByIndex(2);
	}
	
	public static void selectAustralia(WebDriver driver) {
		WebElement element = driver.findElement(By.id(CONTINENTS_ASIA_ID));
		Select sel = new Select(element);
		sel.selectByVisibleText("Australia");
	}
	
	public static void selectSouthAmerica(WebDriver driver) {
		WebElement element = driver.findElement(By.id(CONTINENTS_ASIA_ID));
		Select sel = new Select(element);
		sel.selectByVisibleText("South America");
	}
	
	public static void selectNorthAmerica(WebDriver driver) {
		WebElement element = driver.findElement(By.id(CONTINENTS_ASIA_ID));
		Select sel = new Select(element);
		sel.selectByVisibleText("North America");
	}
	
	public static void selectNorthAntartica(WebDriver driver) {
		WebElement element = driver.findElement(By.id(CONTINENTS_ASIA_ID));
		Select sel = new Select(element);
		sel.selectByVisibleText("Antartica");
	}
	
	public static void selectBrowserCommands(WebDriver driver) {
		WebElement element = driver.findElement(By.id(SELENIUM_COMMANDS_BROWSER_ID));
		Select sel = new Select(element);
		sel.selectByIndex(0);
	}
	
	public static void selectNavigationCommands(WebDriver driver) {
		WebElement element = driver.findElement(By.id(SELENIUM_COMMANDS_BROWSER_ID));
		Select sel = new Select(element);
		sel.selectByIndex(1);
	}
	
	public static void selectSwitchCommands(WebDriver driver) {
		WebElement element = driver.findElement(By.id(SELENIUM_COMMANDS_BROWSER_ID));
		Select sel = new Select(element);
		sel.selectByIndex(2);
	}
	
	public static void selectWaitCommands(WebDriver driver) {
		WebElement element = driver.findElement(By.id(SELENIUM_COMMANDS_BROWSER_ID));
		Select sel = new Select(element);
		sel.selectByIndex(3);
	}
	
	public static void selectWebElementCommands(WebDriver driver) {
		WebElement element = driver.findElement(By.id(SELENIUM_COMMANDS_BROWSER_ID));
		Select sel = new Select(element);
		sel.selectByIndex(4);
	}
	
	public static void uploadImage (WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(UPLOAD_IMAGE_XPATH));
		element.click();
	}
	
	public static void downloadFile (WebDriver driver) {
		WebElement element = driver.findElement(By.linkText(DOWNLOAD_FILE_LINK_LINKTEXT));
		element.click();
	}
	
	public static void clickButton (WebDriver driver) {
		WebElement element = driver.findElement(By.name(BUTTON_NAME));
		element.click();
	}
	
	
	
}
