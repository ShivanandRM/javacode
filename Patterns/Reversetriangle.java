package Patterns;

public class Reversetriangle {
    public static void main(String[] args) {
        pattern3(5);
        
    }
    static void pattern3(int n){
        for( int row=0;row<=n;row++){
            for(int col=n;col>row;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
