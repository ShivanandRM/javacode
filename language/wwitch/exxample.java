package wwitch;
import java.util.Scanner;
public class exxample {
    public static void main(String[] args) {
        System.out.println("Enter a fruit name:");
        Scanner s = new Scanner(System.in);
        String f = s.next();

        switch(f){
            // by using enhanced switch technique
            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("Red fruit");
            default -> System.out.println("Enter a valid fruit name!!");
        }
    }
}
