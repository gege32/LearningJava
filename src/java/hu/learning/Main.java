package hu.learning;

import java.util.ArrayList;
import java.util.List;

import hu.learning.firstex.FirstTask;
import hu.learning.secondex.SecondTask;

public class Main {

	public static void main(String[] args) {
		
		List<ITask> taskList = new ArrayList<>();
		
		taskList.add(FirstTask.getTask());
		taskList.add(new SecondTask());
		
		for(ITask task : taskList){
			System.out.println(task.checkExcercise());
		}
	}

}
