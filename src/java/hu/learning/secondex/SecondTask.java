package hu.learning.secondex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hu.learning.secondex.data.CartesianComplexNumber;
import hu.learning.secondex.data.ComplexNumber;
import hu.learning.secondex.data.PolarComplexNumber;

public class SecondTask implements ISecondTask{
	
	List<ComplexNumber> cplList;
	
	
	@Override
	public boolean checkExcercise() {
		cplList = new ArrayList<ComplexNumber>();
		CartesianComplexNumber cartesianComplexNumber = new CartesianComplexNumber(1, 2);
		cplList.add(cartesianComplexNumber);
		cplList.add(new PolarComplexNumber(2, 3));
		
		cplList.remove(cartesianComplexNumber);
		
		
		List<String> strinbgList = new ArrayList<>();
		strinbgList.add("zxegr");
		strinbgList.add("setgsert");
		strinbgList.add("dtyhnxdfrv");
		
		Map<String, ComplexNumber> testMap = new HashMap<>();

		
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean ex1() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
