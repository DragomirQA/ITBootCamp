package banka_test;

import org.junit.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import bankaArray.Banka;
import banka_kod.Account;
import banka_kod.Bank;

public class BankTest2 {

	@Test
	public void tc1() {

		Account[] racuni = new Account[5];
		for (int i = 0; i < racuni.length; i++) {
			racuni[i] = new Account("Ika");
		}

		SoftAssert sa = new SoftAssert();
		for (int i = 0; i < racuni.length; i++) {
			String expectedBroj = racuni[i].getNumber();
			for (int j = i + 1; j < racuni.length; j++) {
				sa.assertNotEquals(expectedBroj, racuni[j].getNumber());
			}
		}

		sa.assertAll();
	}

	@Test
	public void tc2() {
		Bank bnk = new Bank();
		Account a1 = bnk.openAccount("Biki");
		a1.setAmount(100d);

		bnk.payInMoney(a1.getNumber(), 20d);

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(a1.getAmount(), 120d);

		sa.assertAll();

	}

	@Test
	public void tc3() {
		Bank bnk = new Bank();
		Account a1 = bnk.openAccount("Biki");
		Account a2 = bnk.openAccount("Iki");
		a1.setAmount(500d);

		bnk.transferMoney(a1.getNumber(), a2.getNumber(), 40d);

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(a1.getAmount(), 460d);
		sa.assertEquals(a2.getAmount(), 40d);

		sa.assertAll();
	}

	@Test
	public void tc4() {
		
		Bank bnk = new Bank();
		Account a1 = bnk.openAccount("Biki");
		Account a2 = bnk.openAccount("Iki");
		Account a3 = bnk.openAccount("Diki");
		a1.setAmount(500d);
		a2.setAmount(200d);
		a3.setAmount(100d);

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(bnk.getSumMoney(), 800d);

		sa.assertAll();



	}

}
