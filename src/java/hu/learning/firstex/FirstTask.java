package hu.learning.firstex;

import hu.learning.ITask;

public class FirstTask implements IFirstTask{

	@Override
	public int ex1(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int ex2(int[] array) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean ex3(String test) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int ex4(int[] array) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public boolean checkExcercise() {
		if(5 != ex1(2,5)){
			return false;
		}
		if(ex2(new int[]{2, 14, 85, 63, 12, 9, 65, 11}) != 85){
			return false;
		}if(ex3(new String("AEgaERbaeTHSAedbhserTHBSert")) != true){
			return false;
		}if(ex4(new int[]{2, 9, 1, 4, 0, -5, 6}) == 2){
			return false;
		}
		
		return true;
	}
	
	public static ITask getTask(){
		return new FirstTask();
	}

}
