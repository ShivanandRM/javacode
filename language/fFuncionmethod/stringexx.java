package fFuncionmethod;
import java.util.Scanner;
public class stringexx {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        String a = greet(name);
        System.out.println(a);
    }
    static String greet(String name){
        String greeting = "Hello!  "+name;
        return greeting;
    }
}
