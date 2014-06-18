package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Collatz;

import static org.junit.Assert.*;
import org.junit.Test;

public class junittest {

	@Test
	public void testCollatz200() {
		Collatz.getList().clear();
		assertEquals("[100, 50, 25, 76, 38, 19, 58, 29, 88, 44, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1]", Collatz.coll(200).toString());
	}
	
	@Test
	public void testCollatz10(){
		Collatz.getList().clear();
		assertEquals("[5, 16, 8, 4, 2, 1]", Collatz.coll(10).toString());
	}

}
