package hu.learning.secondex.data;

public class CartesianComplexNumber extends ComplexNumber {
	
	private float a;
	private float bi;
	
	public static final String test = "TesT";
		
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
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof CartesianComplexNumber){
			CartesianComplexNumber tmp = (CartesianComplexNumber)obj;
			if(tmp.getA() == this.a && tmp.getBi() == this.bi){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
	public float getA() {
		return a;
	}
	
	public float getBi() {
		return bi;
	}

	@Override
	public int compareTo(ComplexNumber o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
