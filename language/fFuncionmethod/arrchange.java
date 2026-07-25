package fFuncionmethod;

import java.util.Arrays;

public class arrchange {
    public static void main(String[] args) {
    int a[]= { 1,2,3,4,99};
    change(a);
    System.out.println(Arrays.toString(a));
    }
    static void change(int[] n){
        n[0]=100;
    }
}
