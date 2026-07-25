import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int ans = 0;
        while(true){
             System.out.print("Enter operation:");
             Scanner s = new Scanner(System.in);
             char op = s.next().trim().charAt(0);
             if(op=="+" || op=='-' || op=='*' || op=='/' || op=='%'){
                System.out.print("Enter two number:");
                int a = s.nextInt();
                int b = s.nextInt();

                if(op == '+'){
                    ans = a+b;
                }
                if(op == '-'){
                    ans = a-b;
                }
                if(op == '*'){
                    ans = a*b;
                }
                if(op == '/'){
                    if(b != 0){
                    ans = a/b;
                    }
                }
                 if(op == '%'){
                    ans = a%b;
                }
             } else if(op =='X' || op =='x'){
                break;
             } else{
                System.out.println("Invalid operation!!");
             }
        }
        System.out.println("Answer for the given operation and number is:"+ans);
       
    }
}
