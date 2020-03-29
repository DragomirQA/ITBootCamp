package klikeri;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dete d1 = new Dete("Java", "Javic", 1, 7);
		Dete d2 = new Dete("Git", "Besic", 2, 3);
		Dete d3 = new Dete("Selenium", "Seleniumovic", 3, 5);
		
		d1.getBrKlikera();
		d2.addKliker(5);
		d3.removeKliker(1);
		


	}

}
