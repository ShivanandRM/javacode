package Strings;

public class Exstringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< 26; i++){
            char ch = (char)('a' + i);
            sb.append(ch);
        }
        System.out.println(sb.toString());
        // it is mutable opearation
        // its time complexity is O(N) , it just modify the string
    }
}
