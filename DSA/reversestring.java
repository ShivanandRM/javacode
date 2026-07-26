package DSA;

import java.util.Arrays;

public class reversestring {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverse(s);
        System.out.println(s);

        
    }
    static void reverse(char[] s){
        int start = 0;
        int end = s.length - 1;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
