package hu.learning.third;

public class Elem {
	
	private Elem kovetkezo;
	
	private int ertek;
	
	public Elem(int ertek, Elem kovetkezo) {
		this.kovetkezo = kovetkezo;
		this.ertek = ertek;
	}
	
	public Elem(int ertek) {
		this.ertek = ertek;
		this.kovetkezo = null;
	}
	
	//setter
	public void kovetkezo(Elem kovetkezo) {
		this.kovetkezo = kovetkezo;
	}
	
	
	//getter
	public Elem kovetkezo() {
		return kovetkezo;
	}
	
	//getter
	public int ertek() {
		return ertek;
	}

}
