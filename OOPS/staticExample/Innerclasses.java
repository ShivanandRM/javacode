package OOPS.staticExample;

public class Innerclasses {
    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test t1 = new Test("Hello");
        Test t2 = new Test("Good Morning");
        System.out.println(t1.name);
        System.out.println(t2.name);
        
    }
}
