package fFuncionmethod;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = s.nextInt();
        System.out.println("Enter b:");
        int b = s.nextInt();
        int sum = a + b;
        System.out.println("sum is :" +sum);
        s.close();
    }
}
