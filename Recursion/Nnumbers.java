package Recursion;

import java.util.Scanner;

public class Nnumbers {
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        num(n);
        
    }
    static void num(int n){
        // base condition
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //last statement in the function call is called as tail recursion
        num(n+1);   //this is tail recursion
        
    }
}
