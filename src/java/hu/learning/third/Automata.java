package hu.learning.third;

import java.util.HashMap;
import java.util.Map;

public class Automata {
	
	public enum Money{
		OTOS(5), TIZES(10), HUSZAS(20), OTVENES(50), SZAZAS(100), KETSZAZAS(200);
		
	    private int value;

	    private static Map<Integer, Money> map = new HashMap<Integer, Money>();

	    static {
	        for (Money legEnum : Money.values()) {
	            map.put(legEnum.value, legEnum);
	        }
	    }

	    private Money(final int leg) { value = leg; }

	    public static Money valueOf(int legNo) {
	        return map.get(legNo);
	    }
	}
	
	private Map<Money, Integer> change = new HashMap<Money, Integer>();
	
//	static{
//        for (Money legEnum : Money.values()) {
//        	change.put(legEnum, new Integer(0));
//        }
//	}
	
	
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
			if (tempMoney >= Money.KETSZAZAS.value) {
				if(change.get(Money.KETSZAZAS) != null){
					Integer value = change.get(Money.KETSZAZAS);
					change.put(Money.KETSZAZAS, new Integer(value.intValue() + 1));
				}
				else{
					change.put(Money.KETSZAZAS, new Integer(1));
				}
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
