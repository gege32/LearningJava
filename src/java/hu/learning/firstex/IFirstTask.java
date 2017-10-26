package hu.learning.firstex;

import hu.learning.ITask;

public interface IFirstTask extends ITask{
	
	/**
	 * Return the bigger number.
	 * @param i
	 * @param j
	 * @return
	 */
	public int ex1(int i, int j);
	
	/**
	 * Return the biggest number in array
	 * @param array
	 * @return
	 */
	public int ex2(int[] array);
	
	/**
	 * Checks the string if it contains 'a' or 'A'
	 * @param test
	 * @return true if it has 'a' or 'A'
	 */
	public boolean ex3(String test);
	
	/**
	 * Orders the given array from the lowest to highest, and returns the mean
	 * @return
	 */
	public float ex4(int[] array); // changed the in to float // extra comment

}
