package itbootcamp.predavanja7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class Zadatak_1_0227 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Pomocu jave i seleniuma
//		1. Otvoriti novi prozor u pretrazivacu i otici na IT Bootcamp
//		2. Primeniti metode koje smo vezbali na casu (get URL i Title, navigate - refresh, to, back, forward) 
//		U kodu treba da se prozor maksimizuje, a pre zatvaranja drajvera vrati na prvobitnu velicinu 
//		(hint: koristite smernice okruzenja, ako to ne pomaze, guglajte =) )

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ika\\Desktop\\Chrome Driver\\chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://itbootcamp.rs/");
		
		String title = wd.getTitle();
		
		System.out.println("Naslov stranice je " + title);
		
		int titleLength = title.length();
		
		System.out.println(titleLength);
		
		Dimension d = wd.manage().window().getSize();
		
		wd.manage().window().maximize();
		
		wd.navigate().refresh();
		
		wd.navigate().to("https://www.trka.rs/");
		
		wd.navigate().to("https://trkaprijateljstva.rs/");
		
		wd.navigate().back();
		
		wd.navigate().forward();
		
		wd.navigate().refresh();
		
		wd.manage().window().setSize(d);
		
		wd.close();

		
	}

}
