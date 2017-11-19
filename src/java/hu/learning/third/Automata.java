package hu.learning.third;

public class Automata {
	
	
	private String changedMoney;
	
	public Automata(int money) {
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
		this.changedMoney = "Ketszazas= " + ketszazas + " szazas= " + szazas + " otvenes= " + otvenes + " huszas= " + huszas + " tizes= " + tizes + " otos= " + otos;
			
	}
	
	public String printChangedMoneyMessage() {
		System.out.println(changedMoney);
		return changedMoney;
	}
}
