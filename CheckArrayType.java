package com.thoughtworks;
import java.util.*;

public class CheckArrayType {
    public static int checkArrayType(int [] data, int arraySize){
        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<arraySize;i++){
            if(data[i]%2==0)
                evenCount++;
            else
                oddCount++;
        }
        if(evenCount>0&&oddCount>0)
            return 3;
        else if(evenCount>0)
                return 1;
        else
            return 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int []data = new int[arraySize];
        for(int i=0;i<arraySize;i++)
            data[i] = sc.nextInt();
        if(checkArrayType(data, arraySize)==1)
            System.out.println("The array is Even");
        else if(checkArrayType(data, arraySize)==2)
            System.out.println("The array is Odd");
        else
            System.out.println("The array is mixed");
    }
}
