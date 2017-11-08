package hu.learning.secondex.data;

public class Matrix {
	
//	private float[][] matrix;
//	
		
	public float determinant(float[][] matrix, int matrixSize){
		float det = 0;
		
		if(matrixSize == 1) {
			det = matrix[0][0];
		}
		if(matrixSize == 2) {
			det = matrix[0][0]*matrix[1][1]-matrix[0][1]*matrix[1][0];
		}
		else {
			det=0;
            for(int j1=0;j1<matrixSize;j1++)
            {
                float[][] m = new float[matrixSize-1][];
                for(int k=0;k<(matrixSize-1);k++)
                {
                    m[k] = new float[matrixSize-1];
                }
                for(int i=1;i<matrixSize;i++)
                {
                    int j2=0;
                    for(int j=0;j<matrixSize;j++)
                    {
                        if(j == j1)
                            continue;
                        m[i-1][j2] = matrix[i][j];
                        j2++;
                    }
                }
                det += Math.pow(-1.0,1.0+j1+1.0)* matrix[0][j1] * determinant(m,matrixSize-1);
            }
		}
		return det; // after else it is stolen...
		// from http://www.sanfoundry.com/java-program-compute-determinant-matrix/
		// because I couldn't translate the wikipedia article into a working code.
		
	}
}
