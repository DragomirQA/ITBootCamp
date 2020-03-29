package nizovi.Vezbanje;

import java.util.Scanner;

public class Zadatak_2_0228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
		// redosledom.
		// Primer niza: 32 54 123 18
		// Ispis: 18 123 54 32

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite koliko mesta treba da ima niz");
		int n;
		n = sc.nextInt();

		int[] x = new int[n];

		int i = 0;

		for (i = 0; i < x.length; i++) {
			System.out.println("Unesite broj u nizu");
			x[i] = sc.nextInt();
		}
		System.out.println("Inverzalni niz je");
		for (i = x.length - 1; i >= 0; i--) {
			System.out.println(x[i]);
		}
	}
}
