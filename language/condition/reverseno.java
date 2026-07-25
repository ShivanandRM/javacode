import java.util.Scanner;

public class reverseno {
    public static void main(String[] args) {
        System.out.println("Enter a number n :");
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();

        long a = 0;
        
        while(n>0){
            long r = (n%10);
            a = a * 10 + r;
            // n=n/10;
            n /= 10 ;
        }
        System.out.println("your reverse order number is :" +a );
    }
}
