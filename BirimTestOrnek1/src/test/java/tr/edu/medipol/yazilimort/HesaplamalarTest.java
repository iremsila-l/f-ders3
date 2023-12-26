package tr.edu.medipol.yazilimort;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamalarTest {

	@Test
	public void faktoriyelRec5Sonucu120Olmali() {
		int sonuc = Hesaplamalar.faktoriyelRec(5);
		assertEquals(120, sonuc);
	}

	@Test
	public void testFaktoriyelLoop() {
		int sonuc = Hesaplamalar.faktoriyelLoop(5);
		assertEquals(120, sonuc);
	}
	
	@Test
	public void testFaktoriyel() {
		for (int i=1; i<1000; i++) {
		int sonuc1 = Hesaplamalar.faktoriyelLoop(i);
		int sonuc2 = Hesaplamalar.faktoriyelRec(i);
		assertEquals(sonuc1, sonuc2);
		}
	}
	
	@Test
	public void testToplasayi1vesayi2() {
		assertEquals(8, Hesaplamalar.topla(6, 2));
	}
	@Test
	public void testCikartsayi1vesayi2() {
		assertEquals(-9, Hesaplamalar.cikart(9, 18));
	}
	
	@Test
	public void testCarpsayi1vesayi2() {
		assertEquals(4, Hesaplamalar.carp(2, 2));
	}
}
