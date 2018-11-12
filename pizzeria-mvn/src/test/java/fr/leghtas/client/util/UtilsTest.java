package fr.leghtas.client.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilsTest {
	@Test
	public void verifierEmailKOEmailNull() {
		String email = null;
		Boolean emailVerif = Utils.verifierEmail(email);
		assertEquals(emailVerif, false);
	}
	@Test
	public void verifierEmailKOVide() {
		String email ="";
		Boolean emailVerif = Utils.verifierEmail(email);
		assertEquals( emailVerif, false );
	}
	
	@Test
	public void verifierEmailOK() {
		String email ="b.lalo@gmail.com";
		Boolean emailVerif = Utils.verifierEmail(email);
		assertTrue( emailVerif );
	}
	@Test
	public void verifierEmailKO() {
		String email ="b.lalo@gmail";
		Boolean emailVerif = Utils.verifierEmail(email);
		assertFalse(emailVerif);
	}
	@Test
	public void verifierEmailKOTermComFr() {
		String email ="b.lalo@gmail";
		Boolean emailVerif = Utils.verifierEmail(email);
		assertFalse(emailVerif);
		
	} 
	@Test
	public void verifierEmailKOAroba (){
		String email ="b.lalogmail.com";
		Boolean emailVerif = Utils.verifierEmail(email);
		assertFalse(emailVerif);
		
	}
	
	
}
