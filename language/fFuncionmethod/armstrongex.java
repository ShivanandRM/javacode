package fFuncionmethod;

import java.util.Scanner;

public class armstrongex {
    public static void main(String[] args) {
        // its prints the given no is armstrong or not

        // System.out.println("Enter a: ");
        // Scanner s = new Scanner(System.in);
        // int a = s.nextInt();
        // System.out.println(arm(a));

        // prints armstrong in btw 100 and 1000
        for(int i =100; i<=1000;i++){
            if(arm(i)){
                System.out.println(i);
            }
        }
        
    }
    static boolean arm(int a){
        int or = a;
        int sum = 0;
        while(a>0){
            int rem = a%10;
            sum += rem*rem*rem;
            a = a/10;
        }
        // if(sum == or){
        //     return true;
        // }else {
        //     return false;
        // }
        
        // both are giving same values
        
        return sum == or;
    }

}
