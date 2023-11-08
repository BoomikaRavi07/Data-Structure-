package Linear_Matrix;

import java.util.Scanner;

public class Transpose_Matrix {

	public static void main(String[] args) {
		int row,col;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the row: ");
		row=s.nextInt();
		System.out.print("Enter the col: ");
		col=s.nextInt();
		System.out.println("Enter the matrix elements: ");
		int a[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) 
				a[i][j]=s.nextInt();
			}
		System.out.println("Transpose of a matrix: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) 
			System.out.print(a[j][i]+" ");
			System.out.println();
		}

	}

}
