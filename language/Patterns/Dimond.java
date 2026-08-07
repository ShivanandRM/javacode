package Patterns;

public class Dimond {
    public static void main(String[] args) {
        pattern28(5);
        
    } 
    static void pattern28(int n){
        for(int row=1;row<2*n;row++){
            int totalColInRow = row>n ?2*n-row:row;
            
            int noOfSpace = n-totalColInRow;
            for(int space = 1;space<=noOfSpace;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=totalColInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
