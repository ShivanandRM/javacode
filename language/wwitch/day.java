package wwitch;
import java.util.Scanner;
public class day {
    public static void main(String[] args) {
        System.out.println("Enter a day number:");
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();

        switch(d){
               // by using enhanced switch technique
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("wednseday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter a valid number!!!");

        }
    }
}
