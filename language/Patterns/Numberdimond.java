package Patterns;

public class Numberdimond {
    public static void main(String[] args) {
        pattern30(5);
        
    }
    static void pattern30(int n){
    for(int row = 1; row < 2 * n; row++){

        int totalColInRows = row > n ? 2 * n - row : row;

        for(int space = 1; space <= n - totalColInRows; space++){
            System.out.print("  ");
        }

        for(int col = totalColInRows; col >= 1; col--){
            System.out.print(col + " ");
        }

        for(int col = 2; col <= totalColInRows; col++){
            System.out.print(col + " ");
        }

        System.out.println();
    }
}
}
