package basic;
// finding the alphabets case 
import java.util.Scanner;
public class alphabetcaseex {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Alphabate is in lower case");
        }
        else{
            System.out.println("Alphabet is in Upper case");
        }

    }
}
