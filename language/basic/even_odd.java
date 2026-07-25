package basic;
import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a > 0){
            System.out.println("a is positive number");
        }
        else{
            System.out.println("a is negative number");
        }
    }
}
