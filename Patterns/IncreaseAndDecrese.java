package Patterns;

public class IncreaseAndDecrese {
    public static void main(String[] args) {
        pattern4(4);
        
    }
    static void pattern4(int n){
        for(int row=1;row<2*n;row++){
            int totalColInRows =row>n ? 2*n-row :row ;
            for(int col=1; col<=totalColInRows;col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
