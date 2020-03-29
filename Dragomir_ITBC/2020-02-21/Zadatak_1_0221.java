package proba.paket;

import java.util.Scanner;

public class Zadatak_1_0221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za
		// potrosace sadrzi sledece opcije:

		// 0 - Izlaz iz programa
		// 1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
		// 2 - naplata racuna

		// Ukoliko korisnik unese opciju 0 program se zavrsava.
		// Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu
		// proizvoda i ta cena se dodaje na racun u prodavnici.
		// Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu
		// novca za naplatu racuna.
		// Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se
		// ispise greska, bez umanjenja racuna i da se ponovo ispise meni.
		// Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se
		// kusur i racun se ponovo postavlja na nulu. Zatim se ponovo ispisuje meni.
		Scanner sc = new Scanner(System.in);

		int akcija;
		int s = 0;

		do {
			System.out.println("Dobrodosli u meni za potrosace");

			System.out.println("Ukoliko zelite da dodate proizvod, pritisnite 1");
			System.out.println("Ukoliko zelite da naplatite racun, pritisnite 2");
			System.out.println("Ukoliko zelite da izadjete iz programa, pritisnite 0");
			akcija = sc.nextInt();

			if (akcija == 1) {
				System.out.println("Mozete da dodate proizvod. Unesite cenu proizvoda");
				int y = sc.nextInt();
				s = s + y;

			} else if (akcija == 2) {
				System.out.println("Racun za naplatu je " + s);
				System.out.println("Unesite novac za naplatu");
				int naplata = sc.nextInt();
				if (naplata < s) {
					System.out.println("Racun ne moze biti umanjen. Greska");
				} else {
					System.out.println("Vas kusur je " + (s - naplata));
					s = 0;
				}
			} else {
				System.out.println("Pogresan unos. Unesite novu akciju");
			}

		} while (akcija != 0);

		System.out.println("Kraj");

	}
}
