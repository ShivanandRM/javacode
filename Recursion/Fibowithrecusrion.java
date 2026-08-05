package Recursion;

public class Fibowithrecusrion {
    public static void main(String[] args) {
        System.out.println(fibo(50));
        /*In the recursion the indexing starts from 1 
        thats why it prints n+1 values with compare to iterative  */
        
    }
    static int fibo(int n){
        // base condition
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
