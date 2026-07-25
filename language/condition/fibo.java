import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        System.out.println("Enter a number n: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        int b = 1;
        int count = 1;

        while(count < n){
            

            int temp = a+b;
            a = b;
            b = temp;

            count++;
        }
        System.out.println(a +" ");
    }
}
