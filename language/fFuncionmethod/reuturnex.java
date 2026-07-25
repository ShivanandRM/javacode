package fFuncionmethod;
import java.util.Scanner;

public class reuturnex {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println("sum of number is :" +ans);
    }

        static int sum(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = s.nextInt();
        System.out.print("Enter b:");
        int b = s.nextInt();
        int sum = a + b;
        return sum;
    }
    
}
