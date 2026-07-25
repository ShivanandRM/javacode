package condition;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n<=1){
            System.out.println("neither prime nor composite");
            return;
        }
        int c = 2;
        while(c*c <= n){
            if(n%c==0){
                System.out.println("not prime");
                return;
            }
            c++;
        }
            System.out.println("prime");
        
    }
}
