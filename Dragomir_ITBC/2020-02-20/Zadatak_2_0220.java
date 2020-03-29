package proba.paket;

import java.util.Scanner;

public class Zadatak_2_0220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
		// broj, i ispisuje njihov zbir (zbir pozitivnih brojeva).
		// primer: ako korisnik unese 1 2 5 3 -1, program treba da ispise 11

		Scanner sc = new Scanner(System.in);
		int broj;
		broj = sc.nextInt();
		int sum = 0;

		while (broj >= 0) {

			sum = sum + broj;
			broj = sc.nextInt();
		}

		System.out.println(sum);
	}

}
