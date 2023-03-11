package com.sebastian.vectors;

import javax.swing.JOptionPane;

public class matrix {

	public static final int row = 2;
	public static final int col = 2;
	
	/*
	 * Scalar matrix nI = { {n,0},{0,n} }
	 */
	public static double[][]getScalarMatrix(){
		
		double[][]matrix = new double[row][col];
		String s;
		double scalar;
		
		s = JOptionPane.showInputDialog("Enter your scalar");
		scalar = Double.parseDouble(s);

		matrix[0][0] = scalar;
		matrix[0][1] = 0;
		matrix[1][0] = scalar;
		matrix[1][1] = 0;
		
		return matrix;
		
	}
	
	public static double[][]getScalarMatrix(double scalar){
		
		double[][]matrix = new double[row][col];

		matrix[0][0] = scalar;
		matrix[0][1] = 0;
		matrix[1][0] = scalar;
		matrix[1][1] = 0;
		
		return matrix;
		
	}
	
	/*
	 * Reflection matrix is used to reflect a vector on X or Y axis
	 *
	 * Reflection on Y-axis -> { {-1,0},{0,1} }
	 * 
	 * Reflection on X-axis -> { {1,0},{0,-1} }
	 */
	public static double[][] reflectOnY() {
		
		double[][]matrix = new double[row][col];
		
		matrix[0][0] = -1;
		matrix[0][1] = 0;
		matrix[1][0] = 0;
		matrix[1][1] = 1;
		
		return matrix;
	}
	
	public static double[][] reflectOnX() {
		
		double[][]matrix = new double[row][col];
		
		matrix[0][0] = 1;
		matrix[0][1] = 0;
		matrix[1][0] = 0;
		matrix[1][1] = -1;
		
		return matrix;
	}
	
	/*
	 * Clockwise 90deg Rotation
	 */
	public static double[][] clockwise90() {

		double[][]matrix = new double[row][col];
		
		matrix[0][0] = 0;
		matrix[0][1] = 1;
		matrix[1][0] = -1;
		matrix[1][1] = 0;		
		
		return matrix;
	}
	
	/*
	 * Rotation Matrix
	 * 
	 * When a vector is multiply by this, the vector will rotate in clockwise deg
	 */
	public static double[][]getRotationMatrix(){

		double[][]matrix = new double[row][col];
		
		String s;
		double deg;
		
		s = JOptionPane.showInputDialog("How many degree");
		deg = Double.parseDouble(s);
		
		double rad = Math.toRadians(deg);
		
		matrix[0][0] = Math.cos(rad);
		matrix[0][1] = Math.sin(rad);
		matrix[1][0] = (-1)*(Math.sin(rad));
		matrix[1][1] = Math.cos(rad);
		
		return matrix;
	}
	
	public static double[][]getRotationMatrix(double deg){

		double[][]matrix = new double[row][col];
		
		double rad = Math.toRadians(deg);
		
		matrix[0][0] = Math.cos(rad);
		matrix[0][1] = Math.sin(rad);
		matrix[1][0] = (-1)*(Math.sin(rad));
		matrix[1][1] = Math.cos(rad);
		
		return matrix;
	}
	
	/*
	 * Multipy matrices
	 */
	public static double[][]Multiply_Matrices(double[][]a,double[][]b) {

		int rowA = a.length;
		int colA = a[0].length;

		int rowB = b.length;
		int colB = b[0].length;

		double[][]result = new double[rowA][colB];


		if (colA!=rowB) { System.out.println("Rows of A must equals to the Columans of B"); return null; }

		for (int i=0;i<rowA;i++) {

			for (int j=0;j<colB;j++) { 

			double sum=0;
			
				for (int k=0;k<colA;k++) {

				sum+= a[i][k] * b[k][j];

				} // k

			result[i][j] = sum;

			} // j

		} // i

		return result;

	} // Multiply Matrices Function
	
}





















