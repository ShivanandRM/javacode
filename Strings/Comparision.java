package Strings;

public class Comparision {
    public static void main(String[] args) {
        String a =  "shivanand";
        String b = "shivanand";
        String c = a;
        System.out.println(a == c);
        
        System.out.println(a == b);

        // == comparator. it compare the referacec variable
        String name1= new String("Hello");
        String name2 = new String("Hello");
        System.out.println(name1 == name2);

        // .equals() method. It only checks the values 
        System.out.println(name1.equals(name2));
    }
}
