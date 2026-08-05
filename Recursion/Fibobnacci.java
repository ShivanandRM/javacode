package Recursion;
import java.util.Scanner;
public class Fibobnacci {
    public static void main(String[] args) {
        // without recusrion
        System.out.println("Enter n:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int a=0;
        int b=1;
        for(int i = 0;i<n;i++){
           
            //The positioning starts from 1.
            int temp = a+b;
            a=b;
            b=temp;
        }
         System.out.print(a+" ");
    }
}
