    package OOPS;

    // Create a class for every single student
    class Stu{
        int rollNo;
        String name;
        float marks;
        void changeName(String newName){
            this.name = newName;
            // System.out.println(this.name);
        }
        // you can create a function inside the class
        void greeting(){
            System.out.println("Hello! My name is : " + this.name);
        }
        // constructor taking values from another object

        Stu(Stu other){
            this.rollNo= other.rollNo;
            this.name = other.name;
            this.marks = other.marks;
            // here this is replaced with random and other is replaced with s1
            // like random.name = other.name;
        }

        Stu(){
            this (13,"Bellad-Bagewadi",99.9f);
        }
        Stu(int rollNo, String name, float marks){
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }
        @Override
        protected void finalize() throws Throwable {
            // TODO Auto-generated method stub
            System.out.println("Object is destroyed");
        }
    }

    public class Student {
        public static void main(String[] args) {
           Stu s1 = new Stu();
           Stu random = new Stu(s1);
                      System.out.println("The random name is: "+random.name);


           Stu random2  = new Stu();
           System.out.println("random2 name is: " + random2.name);
           final int HI = 3;
        //    HI = 4; // this is not possible . final keywords are not modifiable 
           System.out.println(HI);

        //    s1.rollNo = 101;
        //    s1.name = "Shivanand";
        //    s1.marks= 99.68f;

        // this is used when you create the function inside the class
            // s1.changeName("Mugali");
            // s1.greeting();

            

            // we need to print when we ues constructor inside the class 

           System.out.println(s1.marks);
           System.out.println(s1.name);
           System.out.println(s1.rollNo);

           final int a = 9;
           

        }
        
    }
