package banka_test;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import banka_kod.Account;

public class AccountTest2 {

	@Test
	public void tc1() {
		String ime = "Dragy";
		String broj = "2301989";

		Account racun = new Account(ime, broj);

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(racun.getNumber(), broj);
		sa.assertAll();
	}

	@Test
	public void tc2() {
		String ime = "Dragy";
		String broj = "2301989";

		Account racun = new Account(ime, broj);

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(racun.getName(), ime);
		sa.assertAll();
	}

	@Test
	public void tc3() {
		String ime = "Dragy";
		String broj = "2301989";

		Account racun = new Account(ime, broj);

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(racun.getAmount(), 0);
		sa.assertAll();
	}

	@Test
	public void tc4() {
		String ime = "Dragy";
		String broj = "2301989";

		Account racun = new Account(ime, broj);
		System.out.println(racun.toString());

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(racun.toString(), "'%s %s %.2f',number,name,amount");

		sa.assertAll();

	}

	@Test
	public void tc5() {
		for (int i = 0; i < 100000; i++) {
			String name = "Yky";
			Account r = new Account(name);
			// System.out.println(r.toString());

			SoftAssert sa = new SoftAssert();
			// ne znam kako da assertujem razlicite brojeve
		}

	}

}
