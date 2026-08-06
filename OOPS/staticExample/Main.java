package OOPS.staticExample;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human(21,"ABC",10000,false);
        Human h2 = new Human(22,"DEF",15000,true);
        Human h3 = new Human(23,"CAF",15080,true);
        System.out.println(h1.name);

        // when we use population as long population only it shows 1 as output
        // when static long population and Human.population is used we get 2

        // when static keyword is using dudring accessing declaring or initializing use the 
        // convention class name 

        // the below things are running correctly . but use conventional class name
        
        // System.out.println(h1.population);
        // System.out.println(h2.population);
        // System.out.println(h3.population);

        // use the conventional class name like this

        // without creating objects you can still able to use static variable 
    

        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

    //    greeting(); // this wont run here because you called the non static object in static method
        
        //  static method only access static data

        Main funn = new Main();
        funn.fun2();
    }

    static void fun(){
        // greeting(); // this static method not access the  non static greeting() method
        // this is dependent on the instance , but the fun() is not  dependent on instance

        //you cannot access non static staff without referancing their instance in static context
        Main obj = new Main();
        obj.greeting();

    }
    void fun2(){
        greeting();
    }
    void greeting(){
        // fun(); // this is valid 
        System.out.println("Hello");
    }
}
