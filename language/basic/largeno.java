package basic;
import java.util.Scanner;
public class largeno {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int a = s.nextInt();
//         int b =  s.nextInt();
//         int c =  s.nextInt();

//         if(a>=b && a>=c){
//             System.out.println("a is greater number");
//         }
//         else if(b>=c && b>=a){
//             System.out.println("b is greater number");
//         }
//         else{
//             System.out.println("c is greater number");
//         }
//     }   
// }
    //  above  coding is not that much of good practice. so use max number property
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        // int max = a;
        // if(b>max){
        //     max = b;
        // }
        // if(c > max){
        //     max = c;
        // }
        // System.out.println("The maximum number is:" +max);

        int max = Math.max(c, Math.max(a,b));

        // System.out.println(Math.max(35, 750));
        System.out.println("The maximum number is :" +max);
    }


}