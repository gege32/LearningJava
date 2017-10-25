package hu.learning.firstex;

import java.util.Arrays;

import hu.learning.ITask;

public class FirstTask implements IFirstTask{

	public int ex1(int i, int j) {
		if(i > j) {
			return i;
		} else {
			return j;
		}
	}
	
	public int ex2(int[] array) {
		int maxi = 0;
		//maxi = array[0];
		for (int i=0; i<array.length; i++) {
			if(maxi < array[i]) {
				maxi = array[i];
			}
		}
		
		return maxi;
	}

	public boolean ex3(String test) {
		int stringLength = test.length();
		for (int i=0 ; i<stringLength; i++) {
			if(test.charAt(i) == 'a') {
				return true;
			} else if(test.charAt(i) == 'A') {
				return true;
			}
		}
		return false;
	}

	public float ex4(int[] array) {
		float sum = 0.0f;
		float mean = 0.0f;
		for(int i=0; i < array.length; i++) {
		sum = sum + array[i];
			if(i == array.length-1) {
				float myArrayLength = 0.0f;
				myArrayLength = array.length;
				mean = sum / myArrayLength;
		}
		}
		Arrays.sort(array);
		return mean;
		
	}
	
	
	
	public boolean checkExcercise() {
		if(5 != ex1(2,5)){
			return false;
		}if(ex2(new int[]{2, 14, 85, 63, 12, 9, 65, 11}) != 85){
			return false;
		}if(ex3(new String("AEgaERbaeTHSAedbhserTHBSert")) != true){
			return false;
		}if(ex4(new int[]{2, 9, 1, 4, 0, -5, 6}) != 2.4285715f){
			//FIXME: I have changed the ex4 method's type to float 
			return false;
		}
		
		return true;
	}
	
	public static ITask getTask(){
		return new FirstTask();
	}

}

