package hu.learning.third;

import hu.learning.ITask;

public class ThirdTask implements ITask{
	
	//rutin feladatok, gyakorlas miatt muszaj megoldani
	
	//a fuggveny irja ki konzolra (System.out.println) hogy legkevesebb darabszamu megyar aprobenzben hogyan lehet kifejezni a kapott erteket
	//konzol pelda:
	// 5FT: 2DB
	// 10FT: 3db
	private void ex1(int money){
		
	}
	
	//Adott az Elem nevu osztaly. A fuggvenyben letrehozott lancolt listahoz keszitsunk egy olyan metodust, 
	//amely torolni tud belole, illetve sorba rendezi nagysag szerint. 
	//a Beillesztest megirtam, hogy ertheto legyen a koncepcio.
	
	// A lancolt listanak csak az elso elemet ismerjuk. Minden tovabbi elemet ugy tudunk megtalalni, hogy vegiglepkedunk minden elemen.
	// A lista utolso elemet onnan ismerjuk, hogy a kovetkezo elemere valo hivatkozasa null.
	private void ex2() {
		
		Elem lista = new Elem(420); // most a listank egy elemu
		
		hozzafuz(lista, new Elem(35));
		
		
	}
	
	//novekvo sorrendbe rendezi az ertek szerint
	private Elem rendez(Elem lista) {
		
		return lista;
	}
	
	
	private Elem megfordit(Elem lista) {
		//megforditja az elemek sorrendjet.
		// Eloszor meg kell keresni a lista utolso elemet, az lesz az uj elso elem. (aztan n+1dik = n-1edik elem), vigyazz, hogy hol tartod a futo valtozokat, nehogy elveszitsd kozben az eredeti lista elemeit
		// HINT: 2 futo valtozo kell, ha hatulrol szeded az elemeket, ha mindig elszaladsz a vegeig, akkor egy is eleg, de az sokkal tobb muvelet
		
		
		return lista;
		
	}
	
	private Elem hozzafuz(Elem lista, Elem uj) {
		// altalaban a lancolt listaban valo navigaciohoz egy futo pointert hasznalunk, amelyet az elso elemre allitunk
		
		Elem futo = lista;
		
		while(futo.kovetkezo() != null) {
			futo = futo.kovetkezo();
		}
		
		//most a futo pointerunk a lista utolso elemere mutat, tehat tudjuk hova kell beilleszteni az uj elemunket
		
		futo.kovetkezo(uj);
		
		return lista;
	}
	
	private Elem elejerefuz(Elem lista, Elem uj) {
		//ha az elejere fuzunk egy elemet, az egyszeru, hiszem csak az uj elemnek kell megmondani, hogy mi legyen a kovetkezo eleme
		// es az uj elem egyben a listank elso eleme lett, tehat maga a lista
		
		uj.kovetkezo(lista);
		
		
		return uj;
	}
	

	@Override
	public boolean checkExcercise() {
		
		ex1(3245);
		ex2();
		
		//mivel ezek a feladatok kozvetlenul nem ellenorizhetoek, igy feltesszuk, hogy jo a megoldas
		return true;
	}

}
