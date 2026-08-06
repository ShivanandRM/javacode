package OOPS.staticExample;

public class Human {
    int age;
    String name;
    float salary;
    boolean married;
    static long population;

    Human(int age, String name, float salary, boolean marrired){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married= marrired;
        // this.population += 1; is incorrect here
        Human.population += 1;

    }
}
