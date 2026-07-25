package Strings;

import java.util.Arrays;

public class performancearray {
    public static void main(String[] args) {
        String[] s = new String[26];

        for(int i = 0; i<26;i++){
            char ch = (char)('A' + i);
            s[i] = String.valueOf(ch);
        }
        System.out.println(Arrays.toString(s));
        // immutable, fot every it creates new object and old object dont have referance variable 
        // that's ehy the time complaxity is O(N^2)

    }
}
