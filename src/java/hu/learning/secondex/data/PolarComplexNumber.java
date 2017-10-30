package hu.learning.secondex.data;

public class PolarComplexNumber extends ComplexNumber {

	private float phi;
	private float r;

	public PolarComplexNumber(float r, float phi) {
		// TODO: needs to be finished
	}

	public CartesianComplexNumber convertToCartesian() {
		// TODO: must be finished
		return new CartesianComplexNumber(0, 0);
	}

	@Override
	public String toString() {
		// TODO: expected formatting: r * (e ^ (i*phi))
		return "";
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

	// TODO: some getters still required, see Cartesian
}
