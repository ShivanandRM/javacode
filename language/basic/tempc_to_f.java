package basic;
import java.util.Scanner;
public class tempc_to_f {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a temperature in dg_c: ");
        float tempc = s.nextFloat();

        float tempf = (tempc * 9/5)+32;
        System.out.println(tempf);
    
    }
}
