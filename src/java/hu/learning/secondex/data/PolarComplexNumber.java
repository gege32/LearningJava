package hu.learning.secondex.data;

public class PolarComplexNumber extends ComplexNumber {

	private float phi;
	private float r;

	public PolarComplexNumber(float r, float phi) {
		this.r = r;
		this.phi = phi;
	}	

	public CartesianComplexNumber convertToCartesian() {
		this.r = getR();
		this.phi = getPhi();
		float a = (float) (Math.sin(this.phi) * this.r);
		float bi = (float) (Math.cos(this.phi) * this.r);
		return new CartesianComplexNumber(a, bi);
	}

	@Override
	public String toString() {
		// TODO: expected formatting: r * (e ^ (i*phi))
		
		return "r:" + r + ", angle:" + phi;
	}

	@Override
	public boolean equals(Object obj) {
		return false;
	}

	@Override
	public int compareTo(ComplexNumber o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public float getR() {
		return r;
	}
	
	public float getPhi() {
		return phi;
	}
}
