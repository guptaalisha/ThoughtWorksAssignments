package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int treeNumber = sc.nextInt();
        //Check for out of bound trees
        if(treeNumber<1 || treeNumber>(rows*columns))
        {
            System.out.println("Tree does not exist");
        }
        //Check for first row, first column & last column
        else if(treeNumber/rows==0 || treeNumber%columns==0 || treeNumber%columns==1){
            System.out.println("This is a Mango Tree");
        }
        else{
            System.out.println("This is a not a Mango Tree");
        }

    }
}
