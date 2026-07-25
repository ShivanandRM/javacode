package wwitch;

import java.util.Scanner;

public class weekend {
    public static void main(String[] args) {
        System.out.println("Enter a day number:");
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();

        switch(d){
            // by using a traditional switch method
            // case 1:
            // case 2:
            // case 3:
            // case 4:
            // case 5:
            //     System.out.println("Weekdays!!!");
            //     break;
           
            // case 6:
            // case 7:
            //     System.out.println("Weekends!!!!!!");
            //     break;
            // default:
            //     System.out.println("Enter a valid number , which are in the 7 days of week!!");

            //  by using a enhanced switch method

            case 1,2,3,4,5 -> System.out.println("Weekdays");
            case 6,7 -> System.out.println("Weekends!!!!!!!!!");

            default -> System.out.println("Enter a valid day number with in a 7 days of week!");
        }
    }
}
