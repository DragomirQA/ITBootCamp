package proba.paket;

public class Zadatak_3_0220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisati 8 primera za post inkrementu (i++), pre inkrementu (++i), post
		// dekrementu (i--) i pre dekrementu (--i)
		// i u programu u komentarima opisati kako koji primer funkcionise.
		// Napisati po 2 primera o svakom, koristeci promenljive a, b, c koje su i
		// deklarisane i definisane (kao sto smo na tabli vezbali na casu)

		// INKREMENT I DEKREMENT SMANJUJU I POVECAVAJU VREDNOST ZA 1

		int a = 12;
		int c = 10;

		int b = a++ + --c;

		System.out.println(a); // na a je dodato 1
		System.out.println(b); // b je izracunato tako sto je od c oduzeto 1, a a je ostalo isto.
		System.out.println(c); // od c je oduzeto 1

		int x = 20;
		int y = 5;

		x = x++ + --y + y-- + ++x;
		// Imamo prvo da je x = 20, odatle nakon x++ ima vrednost 21. y = 5 koje nakon
		// --y ima vrednost 4. Kada saberemo te dve vrednosti, dobijamo 25.
		// Dalje, y sada ima vrednost 4 koja nakon y-- ima novu vrednost 3. U nastavku
		// dolayimo do x koje sada ima vrednost 22 koja nakon ++x ima vrednost 25.
		// Kada sve to saberemo, dakle
		System.out.println(x); // od gore se vidi da je x = 50
		System.out.println(y); // poslednja vrednost koja je zapamcena je 3

	}
}