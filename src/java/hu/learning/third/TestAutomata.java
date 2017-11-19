package hu.learning.third;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestAutomata {

	int money = 3245;
	Automata automata = new Automata(money);
	int ketszazas = 16;
	int szazas = 0;
	int otvenes = 0;
	int huszas = 2;
	int tizes = 0;
	int otos = 1;
	
	String expectedMessage = "Ketszazas= " + ketszazas + " szazas= " + szazas + " otvenes= " + otvenes + " huszas= " + huszas + " tizes= " + tizes + " otos= " + otos;
	@Test
	public void testAutomata() {
		
		assertEquals(expectedMessage,automata.printChangedMoneyMessage());
		
	}
}
