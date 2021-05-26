package com.thoughtworks;
import java.util.*;

public class CollatzSequence {
    public static void printCollatzSequence(int number){
        while(number!=1){
            System.out.print(number+"-"+">");
            number=(number%2==0)?(number/2):(3*number)+1;
        }
        System.out.print(number);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number:");
        int number = sc.nextInt();
        if(number>0) {
            System.out.print("The Collatz Sequence is: ");
            printCollatzSequence(number);
        }
        else
            System.out.println("Enter a valid number");
    }
}
