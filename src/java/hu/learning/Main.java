package hu.learning;

import java.util.ArrayList;
import java.util.List;

import hu.learning.firstex.FirstTask;
import hu.learning.secondex.SecondTask;
import hu.learning.third.ThirdTask;

public class Main {

	public static void main(String[] args) {
		
		List<ITask> taskList = new ArrayList<>();
		
		taskList.add(FirstTask.getTask());
		taskList.add(new SecondTask());
		taskList.add(new ThirdTask());
		
		for(ITask task : taskList){
			System.out.println(task.checkExcercise());
		}
	}

}
