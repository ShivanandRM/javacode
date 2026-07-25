package Strings;
import java.util.Arrays;
public class Exmethods {
    public static void main(String[] args) {
        String name = "Shivanand R Mugali";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.charAt(0));
        String a = "            ShivanadM          ";
        System.out.println(a.strip());
        System.out.println(name.indexOf("M"));
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
