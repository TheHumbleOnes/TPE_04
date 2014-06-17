package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Collatz;

import java.util.Iterator;
import java.util.ListIterator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMain {

	
	CollatzMethode c1 = new CollatzMethode(1, 250000);
	
	
	Thread t1 = new Thread(c1);
	
	
		@Test
		public void Collatz(){
			
			t1.start();
			
			
				
			
		assertEquals("Längste Folge mit Iterationen bei Zahl 230631", c1.toString());
		
		}
	

}
