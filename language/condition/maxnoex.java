package condition;
import java.util.Scanner;
public class maxnoex {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int max = a;
        if (b>max){
            max = b;
           
        }
        if(c>max){
            max = c;
        }
         System.out.println(" maximum number is" +max);
        
    }   
}
