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
		this.a = getA();
		this.bi = getBi();
		float r = (float) Math.sqrt((this.a * this.a) + (this.bi * this.bi));
		float phi = (float) Math.sin(this.bi / r);
		return new PolarComplexNumber(r,phi);
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
