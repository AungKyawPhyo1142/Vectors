package com.sebastian.vectors;

import javax.swing.JOptionPane;

/*
	All the vectors in this program are on two dimensional space
	thus, all the vectors has 2rows and 1col.
*/

public class vectors {
	
	public static final int row = 2;
	public static final int col = 1;
	
	
	// get a vector
	public static double[][]getVector(){
		double[][]v = new double[row][col];
		String s;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				s = JOptionPane.showInputDialog("Enter element");
				v[i][j] = Double.parseDouble(s);
			}
		}
		return v;
	}
	
	// print a vector
	public static void printVector(double[][]v) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println(v[i][j]);
			}
		}
	}
	
	// adding two vectors
	public static double[][]addVectors(double[][]v1, double[][]v2){
		
		double[][]v3 = new double[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				v3[i][j] = v1[i][j] + v2[i][j];
			}
		}
		
		return v3;	
	
	}
	
	// scale a vector with a scalar
	public static double[][]scaleVector(double[][]v, double scalar){
		double[][]res = new double[row][col];
		
		for(int i=0;i<row;i++) {
			res[i][0] = scalar * v[i][0];
		}
		
		return res;
	}
	
	/*
	 * Magnitude of a vector is its length in space
	 */
	public static double magnitude(double[][]v) {

		double mag=0;
		double val=0;
		
		val = (v[0][0] * v[0][0]) + (v[1][0] * v[1][0]);
		
		mag = Math.sqrt(val);
		
		return mag;
	}
	
	/*
	 * Vector normalization is converting a vector into unit vector
	 */
	public static double[][]norm(double[][]v){
		
		double[][]res = new double[row][col];
		
		double mag = 0;
		
		// if the vector is a zero vector, throws an error
		try {
			if(v[0][0]==0 && v[1][0]==0) {
				throw new customException("Can\'t normalize a zero vector");
			}
			else {
				mag = magnitude(v);
			}
		}
		catch(customException e) {
			System.out.println("Custom Exception: "+e.getMessage());
		}
		
		res[0][0] = v[0][0]/mag;		
		res[1][0] = v[1][0]/mag;
		
		return res;
		
	}
	
	/*
	 * Normal Vector is when the two vectors become perpendicular to each other
	 */
	public static double[][]normalVector(double[][]v){
		double[][]normal = new double[row][col];
		
		normal[0][0] = (-1)*v[1][0];
		normal[1][0] = v[0][0];
		
		return normal;
	}
	
	/*
	 * Dot Product or Scalar Product is a value
	 * when u multiply the values of the x and y of the vectors and add them
	 */
	public static double dotProduct(double[][]v1, double[][]v2) {
		
		double scalar=0;
		
		for(int i=0;i<row;i++) {
			scalar += v1[i][0] * v2[i][0];
		}
		
		return scalar;
	}
	
}








































