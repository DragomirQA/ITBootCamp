package nizovi.Vezbanje;

import java.util.Scanner;

public class Zadatak_1_0228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Korisnik ucitava niz od n elemenata niza, kao i neki broj br. 
		// Program ispisuje elemente niza deljive brojem br.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite koliko mesta treba da ima niz");
		int n;
		n = sc.nextInt();
		
		System.out.println("Unesite broj za deljenje");
		int br;
		br = sc.nextInt();
		
		int[] x = new int[n];
		
		int i = 0;
		
		for (i = 0; i < x.length; i++) {
			System.out.println("Unesite broj u nizu");
			x[i] = sc.nextInt();
			
			if (x[i] % br == 0 ) {
				System.out.println("Broj je deljiv sa unetim brojem");
				System.out.println(x[i]);
			
		}
		
		}
		

	}

}
