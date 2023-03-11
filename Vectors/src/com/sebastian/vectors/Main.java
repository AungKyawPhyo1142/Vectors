package com.sebastian.vectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = vectors.row;
		int col = vectors.col;
		
		double[][]o = new double[row][col];
		double[][]u = new double[row][col];
		double[][]v = new double[row][col];
		

		o = vectors.getVector();
		u = vectors.getVector();
		v = vectors.getVector();

		// Reflecting three vectors on X
		double[][]Refo = new double[row][col];
		double[][]Refu = new double[row][col];
		double[][]Refv = new double[row][col];
		
		Refo = matrix.Multiply_Matrices(matrix.reflectOnX(), o);
		Refu = matrix.Multiply_Matrices(matrix.reflectOnX(), u);
		Refv = matrix.Multiply_Matrices(matrix.reflectOnX(), v);
		
		System.out.println("\n-------------------- Reflect on X --------------------");
		
		System.out.println("\nReflect O: ");
		vectors.printVector(Refo);
		
		System.out.println("\nReflect U: ");
		vectors.printVector(Refu);

		System.out.println("\nReflect V: ");
		vectors.printVector(Refv);
		
		// rotate the three vectors by 180 clockwise
		double[][]Ro = new double[row][col];
		double[][]Ru = new double[row][col];
		double[][]Rv = new double[row][col];
		
		Ro = matrix.Multiply_Matrices(matrix.getRotationMatrix(180), o);
		Ru = matrix.Multiply_Matrices(matrix.getRotationMatrix(180), u);
		Rv = matrix.Multiply_Matrices(matrix.getRotationMatrix(180), v);
		
		System.out.println("\n-------------------- Rotate 180 clockwise --------------------");
		
		System.out.println("\nRotate O: ");
		vectors.printVector(Ro);
		
		System.out.println("\nRotate U: ");
		vectors.printVector(Ru);

		System.out.println("\nRotate V: ");
		vectors.printVector(Rv);
		
		
	}

}
