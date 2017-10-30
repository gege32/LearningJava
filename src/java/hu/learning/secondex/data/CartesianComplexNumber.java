package hu.learning.secondex.data;

public class CartesianComplexNumber extends ComplexNumber {
	
	private float a;
	private float bi;
	
	public CartesianComplexNumber(float a, float bi) {
		this.a = a;
		this.bi = bi;
	}	
	
	@Override
	public String toString() {
		return a + " + " + bi + "i";
	}
	
	public PolarComplexNumber convertToPolar() {
		//TODO: must be finished
		return new PolarComplexNumber(0, 0);
	}
	
	public float getA() {
		return a;
	}
	
	public float getBi() {
		return bi;
	}

}
