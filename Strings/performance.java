package Strings;

public class performance {

    public static void main(String[] args) {


        String s ="";
        for(int i = 0; i< 26;i++){
            char ch = (char)('A' + i);
            
            s += ch;
        }
        System.out.println(s);
    }
}