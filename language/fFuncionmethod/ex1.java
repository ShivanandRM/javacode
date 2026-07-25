package fFuncionmethod;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in)  ;
            System.out.print("Enter n1:");
            int n1 = s.nextInt();
            System.out.print("Enter n2:");
            int n2 = s.nextInt();
        sum(n1, n2);

        if(n1 ==1){
            System.out.println("when if condition is occured");
            sum(n1,n2);
        }
        else{
            System.out.println("Enter a correct number!");
        }
    }
        static void sum(int n1, int n2){
            
            int sum = n1+n2;
            System.out.println("Sum of two number is :" +sum);
        }
      
    }

