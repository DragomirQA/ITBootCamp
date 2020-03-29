package domaci;

import java.util.Scanner;

public class Zadatak_2_0206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji na osnovu unetog naziva meseca ispisuje koliko ima
		 * meseci u godini koji pocinju na to slovo(na taj glas) - za resavanje ovog
		 * zadatka koristiti switch
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite naziv meseca. Pocetno slovo meseca treba da bude veliko");

		String m = sc.next();

		switch (m) {

		case "Januar":
		case "Jun":
		case "Jul":
			System.out.println("3");
			break;

		case "Mart":
		case "April":
		case "Maj":
		case "Avgust":
			System.out.println("2");
			break;

		case "Februar":
		case "Septembar":
		case "Oktobar":
		case "Novembar":
		case "Decembar":
			System.out.println("1");
			break;

		default:
			System.out.println("Unos je pogresan");

		}

	}

}
