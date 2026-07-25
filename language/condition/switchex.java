import java.util.Scanner;
public class switchex {
    public static void main(String[] args) {
        System.out.println("Enter a fruit name:");
        Scanner s = new Scanner(System.in);
        String fruit = s.next();

        switch (fruit) {
            // Enhanced switch using
            // case "mango" -> System.out.println("king");
            // case "apple" -> System.out.println("Red fruit");
            // default -> System.out.println("end of code");

            // Traditional switch using
            case "Mango":
                System.out.println("King of fruit");
                break;
            case "Apple":
                System.out.println("red colored fruit");
                break;
            case "Grapes":
                System.out.println("very small fruit");
                break;
            default:
                System.out.println("Enter a valid fruit name!!!!");
        }
        System.out.println("Thank you for visiting our website");
    }
}

