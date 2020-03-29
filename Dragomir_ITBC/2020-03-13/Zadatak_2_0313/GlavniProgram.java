package drama;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pozoriste p = new Pozoriste("Pozoriste senki");

		p.getNazivPoz();
		System.out.println(p.getNazivPoz());

		Zaposleni z = new Zaposleni("Zeljka Blazic", "Hyppo");
		z.getRadnoPoz();
		System.out.println(z.getRadnoPoz());

		Glumac g = new Glumac("Branko Kockica", "Puz", "Preletac");
		g.getPunoIme();
		g.getRadnoPoz();
		System.out.println(g.getPunoIme());
		System.out.println(g.getRadnoPoz());

		Reditelj r = new Reditelj("Ang Li", "Hong Kong", "Car");
		r.getPunoIme();
		r.getRadnoPoz();
		System.out.println(r.getPunoIme());
		System.out.println(r.getRadnoPoz());

		Predstava pr = new Predstava("Mudro prasence", "Papkar");
		pr.getBrojZaposlenih();
		System.out.println(pr.getBrojZaposlenih());
		pr.ispisPredstave();

	}

}
