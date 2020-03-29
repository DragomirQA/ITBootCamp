package proba.paket;

import java.util.Scanner;

public class Zadatak_4_0121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisati program koji ce ispisati n brojeva Fibonacijevog niza.
		// (Na internetu istraziti sta je Fibonacijev niz!!!)


		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj so kog zelite da vam se prikaze Fibonacijev niz");
		int fn = sc.nextInt();

		int nula = 0;
		int jedinica = 1;
		System.out.print("Trazeni niz je ");

		for (int i = 1; i <= fn; ++i) {
			System.out.print(nula + " , ");

			int sum = nula + jedinica;
			nula = jedinica;
			jedinica = sum;
		}

	}
}
