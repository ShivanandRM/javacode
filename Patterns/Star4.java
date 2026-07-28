package Patterns;

public class Star4 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for(int row = 1; row<= n; row++){
            // for every run the colums
            for(int col = 1; col <= row ;col++){
                System.out.print("* ");
            }
            // when row is printed we need to new line
            System.out.println();
        }
    }
}
