package hu.learning.third;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAutomata {

	
	
	
	@Before
	public void start(){
		
	}
	
	@Test
	public void testAutomata() {
		//GIVEN
		int money = 3245;
		Automata automata = new Automata(money);
		int ketszazas = 16;
		int szazas = 0;
		int otvenes = 0;
		int huszas = 2;
		int tizes = 0;
		int otos = 1;
		
		//WHEN
		String printChangedMoneyMessage = automata.printChangedMoneyMessage();
		
		//THEN
		String expectedMessage = "Ketszazas= " + ketszazas + " szazas= " + szazas + " otvenes= " + otvenes + " huszas= " + huszas + " tizes= " + tizes + " otos= " + otos;
		assertEquals(expectedMessage, printChangedMoneyMessage);
		
		
		
	}
	
	@After
	private void stop(){
		
	}
}
