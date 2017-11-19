package hu.learning.third;

import java.util.HashMap;
import java.util.Map;

import hu.learning.ITask;

public class ThirdTask implements ITask{
	
	//rutin feladatok, gyakorlas miatt muszaj megoldani
	
	//a fuggveny irja ki konzolra (System.out.println) hogy legkevesebb 
	//darabszamu megyar aprobenzben hogyan lehet kifejezni a kapott erteket
	//konzol pelda:
	// 5FT: 2DB
	// 10FT: 3db
	
	public String ex1(int money){
		int ketszazas = 0;
		int szazas = 0;
		int otvenes = 0;
		int huszas = 0;
		int tizes = 0;
		int otos = 0;
		int tempMoney = money;
		while(tempMoney != 0){
			if (tempMoney >= 200) {
				ketszazas = ketszazas + 1 ;
				tempMoney = tempMoney - 200;
			}
			else if (tempMoney >= 100 ) {
				szazas += 1;
				tempMoney = tempMoney - 100;
			}
			else if (tempMoney >= 50 ) {
				otvenes += 1;
				tempMoney = tempMoney - 50;
			}
			else if (tempMoney >= 20 ) {
				huszas += 1;
				tempMoney = tempMoney - 20;
			}
			else if (tempMoney >= 10) {
				tizes += 1;
				tempMoney = tempMoney - 10;
			}
			else if (tempMoney >= 5) {
				otos += 1;
				tempMoney = tempMoney - 5;
			}
		
		}
		String message = "Ketszazas= " + ketszazas + " szazas= " + szazas + " otvenes= " + otvenes + " huszas= " + huszas + " tizes= " + tizes + " otos= " + otos;
//		Map<String, Integer> moneyMap = new HashMap<String, Integer>();
//		moneyMap.put("Ketszazas", ketszazas);
//		moneyMap.put("Szazas", szazas);
//		moneyMap.put("Otvenes", otvenes);
//		moneyMap.put("Huszas", huszas);
//		moneyMap.put("Tizes", tizes);
//		moneyMap.put("Otos", otos);
//		System.out.println("A legkevesebb aproval kifizetni az adott osszeget:" + moneyMap );
//		System.out.println(message);
		
		return message;
		
	}
	
	//Adott az Elem nevu osztaly. A fuggvenyben letrehozott lancolt listahoz
	//keszitsunk egy olyan metodust, 
	//amely torolni tud belole, illetve sorba rendezi nagysag szerint. 
	//a Beillesztest megirtam, hogy ertheto legyen a koncepcio.
	
	// A lancolt listanak csak az elso elemet ismerjuk. Minden tovabbi 
	//elemet ugy tudunk megtalalni, hogy vegiglepkedunk minden elemen.
	// A lista utolso elemet onnan ismerjuk, hogy a 
	//kovetkezo elemere valo hivatkozasa null.
	private void ex2() {
		
		Elem lista1 = new Elem(420); // most a listank egy elemu
		Elem lista2 = new Elem(420); // most a listank egy elemu
		Elem lista3 = new Elem(420); // most a listank egy elemu
		Elem lista4 = new Elem(420); // most a listank egy elemu
		hozzafuz(lista1, new Elem(35));
		hozzafuz(lista1, new Elem(120));
		hozzafuz(lista1, new Elem(22));
		hozzafuz(lista1, new Elem(10));
		hozzafuz(lista1, new Elem(100));
		hozzafuz(lista2, new Elem(35));
		hozzafuz(lista2, new Elem(120));
		hozzafuz(lista2, new Elem(22));
		hozzafuz(lista2, new Elem(10));
		hozzafuz(lista2, new Elem(100));
		hozzafuz(lista3, new Elem(35));
		hozzafuz(lista3, new Elem(120));
		hozzafuz(lista3, new Elem(22));
		hozzafuz(lista3, new Elem(10));
		hozzafuz(lista3, new Elem(100));
		hozzafuz(lista4, new Elem(35));
		hozzafuz(lista4, new Elem(120));
		hozzafuz(lista4, new Elem(22));
		hozzafuz(lista4, new Elem(10));
		hozzafuz(lista4, new Elem(100));
		
		printList(lista1);
		printList(megfordit(lista2));
		printList(rendez(lista3));
		printList(torolErtekkel(lista4, 420));
		
	}
	private Elem torolErtekkel(Elem lista ,int ertek) {
		if (lista.ertek() == ertek) {
			lista = lista.kovetkezo();
		}
		Elem current = lista;
		while (current.kovetkezo() != null) {
			if (current.kovetkezo().ertek() == ertek) {
				current.kovetkezo(current.kovetkezo().kovetkezo());
				
			}
			current = current.kovetkezo();	
		}
		return lista;
						
	}
	//novekvo sorrendbe rendezi az ertek szerint
	private Elem rendez(Elem lista) {
		
		Elem newHead = new Elem(lista.ertek());
		Elem pointer = lista.kovetkezo(); //kovetkezore mutat
 
		// loop through each element in the list
		while (pointer != null) {
			// insert this element to the new list
 
			Elem innerPointer = newHead; // belso pointer
			Elem next = pointer.kovetkezo(); // kovetkezo pointer
 
			if (pointer.ertek() <= newHead.ertek()) { //h pointer kisebb mint a head, 
				//akkor csere 
				Elem oldHead = newHead; 
				newHead = pointer;
				newHead.kovetkezo(oldHead);
			} else {
				while (innerPointer.kovetkezo() != null) { 
 
					if (pointer.ertek() > innerPointer.ertek() && pointer.ertek() <= innerPointer.kovetkezo().ertek()) {
						Elem oldNext = innerPointer.kovetkezo();
						innerPointer.kovetkezo(pointer);
						pointer.kovetkezo(oldNext);
					}
 
					innerPointer = innerPointer.kovetkezo();
				}
 
				if (innerPointer.kovetkezo() == null && pointer.ertek() > innerPointer.ertek()) {
					innerPointer.kovetkezo(pointer);
					pointer.kovetkezo(null);
				}
			}
 
			// finally
			pointer = next;
		}
		
		Elem rendezettLista = newHead;
		
		return rendezettLista;
		
	}

	public static void printList(Elem x) {
		if(x != null){
			System.out.print(x.ertek() + " ");
			while (x.kovetkezo() != null) {
				System.out.print(x.kovetkezo().ertek() + " ");
				x = x.kovetkezo();
			}
			System.out.println();
		}
 
	}

		
	private Elem megfordit(Elem lista) {
		//megforditja az elemek sorrendjet.
		// Eloszor meg kell keresni a lista utolso elemet, az lesz az uj elso elem. 
		//(aztan n+1dik = n-1edik elem), vigyazz, hogy hol tartod a futo valtozokat, 
		//nehogy elveszitsd kozben az eredeti lista elemeit
		// HINT: 2 futo valtozo kell, ha hatulrol szeded az elemeket, 
		//ha mindig elszaladsz a vegeig, akkor egy is eleg, de az sokkal tobb muvelet
		
//		Elem megforditottLista = null;
//		Elem futo1 = lista;
//		
//		while (futo1.kovetkezo() != null) {
//			Elem futo2 = lista;
//			while(futo2.kovetkezo() != null) {
//				futo2 = futo2.kovetkezo();
//			}
//			if (futo1 == lista) {
//				megforditottLista = futo2;
//				torolErtekkel(lista , futo2.ertek()); 
//				
//				
//				
//			}else {
//				Elem futo3 = megforditottLista;
//				while(futo3.kovetkezo() !=  null) {
//					futo3 = futo3.kovetkezo();
//				}
//				futo3.kovetkezo(futo2);
//				torolErtekkel(lista , futo2.ertek()); 
//								
//			}
	    
		if(lista==null||lista.kovetkezo()==null)
	        return lista;
	 
	    Elem p1 = lista;
	    Elem p2 = p1.kovetkezo();
	 
	    lista.kovetkezo(null);
	    
	    while(p1 != null && p2 != null){
	        Elem t = p2.kovetkezo();
	        p2.kovetkezo(p1);
	        p1 = p2;
	        p2 = t;
	    }
	 
	    return p1;	
		
	}
		
	
	private Elem hozzafuz(Elem lista, Elem uj) {
		// altalaban a lancolt listaban valo navigaciohoz egy futo pointert hasznalunk,
		//amelyet az elso elemre allitunk
		
		Elem futo = lista;
		
		while(futo.kovetkezo() != null) {
			futo = futo.kovetkezo();
		}
		
		//most a futo pointerunk a lista utolso elemere mutat, tehat tudjuk hova
		//kell beilleszteni az uj elemunket
		
		futo.kovetkezo(uj);
		
		return lista;
	}
	
	private Elem elejerefuz(Elem lista, Elem uj) {
		//ha az elejere fuzunk egy elemet, az egyszeru, hiszem csak az 
		//uj elemnek kell megmondani, hogy mi legyen a kovetkezo eleme
		// es az uj elem egyben a listank elso eleme lett, tehat maga a lista
		
		uj.kovetkezo(lista);
		
		
		return uj;
	}
	
	
	@Override
	public boolean checkExcercise() {
		
		ex1(3245);
		ex2();

		
		
		//mivel ezek a feladatok kozvetlenul nem ellenorizhetoek,
		//igy feltesszuk, hogy jo a megoldas
		return true;
	}

}
