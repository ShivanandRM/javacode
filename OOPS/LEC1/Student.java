    package OOPS.LEC1;

    public class Student {
        class a{
            @Override
            protected void finalize() throws Throwable {
                // TODO Auto-generated method stub
                System.out.println("object is destroyed");
            }
        }
        int rollno;
        String name;
        float marks;

        void changeName(String newname){
            this.name = newname;
        }

        void greeting(){
            System.out.println("My name is: "+this.name);
        }
        Student(){
            this.rollno = 12;
            this.name = "shiva ";
            this.marks= 99.9f;

        }

        public static void main(String[] args) {
            Student s1 = new Student();
            Student rahul = new Student();
            // s1.rollno = 1;
            // s1.name = "shivanand";
            // s1.marks = 100;

             s1.changeName("Shivanand");
             s1.greeting();
            
            Student one = new Student();
            Student two = one;
            System.out.println(one.name);
            one.name = "hwlloooooooo";
            
            System.out.println(two.name);
             
            // System.out.println(rahul.rollno);
            // System.out.println(rahul.name);
            // System.out.println(rahul.marks);
        }
        
    }
