package com.thoughtworks;
import java.util.*;

public class UpperTriangularMatrix {
    static int rows,columns;
    static int[][] matrix;
    public static boolean isUpperTriangularMatrix(){
    	for(int i=1;i<rows;i++)
    		for(int j=0;j<i;j++)
    			if(matrix[i][j]!=0)
    				return false;

		return true;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	rows = sc.nextInt();
	columns = sc.nextInt();
	System.out.println((rows!=columns)?"It is not a square matrix":"Enter the matrix elements");
	matrix = new int[rows][columns];
	for(int i=0;i<rows;i++)
	    for(int j=0;j<columns;j++)
	        matrix[i][j]=sc.nextInt();
	System.out.println((isUpperTriangularMatrix())?"Yes":"No");
    }
}
