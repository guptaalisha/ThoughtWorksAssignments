package com.thoughtworks;
import java.util.*;
public class ArrayRange {
    static int arraySize;
    public static int calculateArrayRange(int [] array){
        int maximum=array[0];
        int minimum=array[0];
        for(int i=0;i<arraySize;i++){
            maximum = Math.max(array[i],maximum);
            minimum = Math.min(array[i],minimum);
        }
        return (maximum-minimum);
    }
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	arraySize = sc.nextInt();
	int [] array = new int[arraySize];
	for(int i=0;i<arraySize;i++)
	    array[i]=sc.nextInt();
	System.out.print("The array range is ");
	System.out.println(calculateArrayRange(array));
    }
}
