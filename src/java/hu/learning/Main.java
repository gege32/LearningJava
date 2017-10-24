package hu.learning;

import hu.learning.firstex.FirstTask;

public class Main {

	public static void main(String[] args) {
		ITask firstTask = FirstTask.getTask();
		
		System.out.println(firstTask.checkExcercise());
	}

}
