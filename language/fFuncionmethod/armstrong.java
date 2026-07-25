package fFuncionmethod;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        System.out.println("Enter a: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int sum = 0;
        while(a>0){
            int rem = a%10;
            // use cube for 3 digits
            // sum += rem*rem*rem;

            // use raise to 4 for 4 digits
            sum += rem*rem*rem*rem;
            a = a/10;
        }
        System.out.println("Armstrong number is :" +sum);
        s.close();
    }
}
