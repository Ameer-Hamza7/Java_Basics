/*
 * Java Object Oriented Programming System 
 * 28 Of June 2022
 * Code By : Ameer Hamza
 * Email : ameerhamza91290@gmail.com
 * Github : ameerhamza-07
 * 
 * 
 * Conventions : Class Names should starts with Uppercase Letter
 * Conventions : Function Names should starts with LowerCase Letter
 * 
 * 
 * CodeBase Restrictions : File and the Main function have same Name
 */ 

/*********************************************************************
 * IMPORTANT POINTS IMPORTANT POINTS IMPORTANT POINTS IMPORTANT POINTS
 *********************************************************************
 * /

/* 
 * If we dont create any construtor so it will be auto genereated in every Java Class
 * Constructors : Method that is responsible for creating Class Objects or Instances
 * Types of Constructors
 *  - Non Parametrize Constructors
 *  - Parametric Constructors
 *  - Copy Constructors (Copy any object into another object)
 * 
 * 
 * Writing Constructors
 *  - Constructor have same name as the class have
 *  - Constructor don't return anything even we cannot use void with them
 *  - A constructor can only call once
 * 
 * 
 * Destroying Objects 
 *  - Destructors
 *  - Provides Garbage Collector instead of Writing our own Destructors
 * 
 * 
 * 4 Pillars of OOPs
 *  - Polymorphism (Many Types [ One work in different Types ])
 *     - Function Overloading  [ Compile Time Polymorphism ] there should be a slight difference in both functions
 *       may their return type should change or their parameter type shoukd change or the number of parameters should 
 *       change.
 * 
 *     - Function Overriding   [ Run Time Polymorphism ]
 *  
 *  - Inheritance [ To inherit the properties of Parent Class ] i.e Inheritance.java
 *      
 * 
 *  - Abstraction
 *  - Encapsulation
 * 
 * 
 * 
 * 
 */

 /*
  * 1. Encapsulation :- Wrapping up of data member (variables) and member function (method) together into a single unit called is known as encapsulation .
    2. Abstruction :- It is the act of representung essential features of class without including the background details.
    ex :- switch board , etc.
    3. Polymorphism :- It is the ability of an object to behave in different form according to the message passed to it.
    In java it is implimentes due to function ove loading 
    4. Inheritance :- It is the ability of an object to acquire the properties of another class.
  */
  
class Pen {


    // Pen Class Attributes (Data)

    String color;
    String type;
    String brand;


    // Pen Class Method (Members)

    public void write( 
        String line
    ) {
        System.out.println(
            "------------------------------\nPen Info\tPen Info\n------------------------------\nColor : " + this.color + "\nType : " + this.type + "\nBrand : " + this.type
        );
        System.out.println(
            "------------------------------\nQuote\tQuote\n------------------------------\n"
            + line + " in " + this.color + " color"
        );
    }

}


class Student {
    String name;
    int age;

    public void printInfo() {           // public keyword represents that the function depends upon the objects we cannot call them directly from class
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
    }

    // Constructor with no parameters

    // Student () {
    //     System.out.println("Constructor Works");
    // }

    // Constructor with parameters

    // Student (String name, int age) {
    //     this.name = name;
    //     this.age = age;
    //     this.printInfo();       // We can call the class methods inside constructor

    //     System.out.println("Constructor Works");
    // }

    // Copy Constructor

    Student(Student s2) {
        System.out.println("Copying.................");
        this.name = s2.name;
        this.age = s2.age;

    }

    Student () {

    }

    // PolyMorphism ( Function Overloading )

    public void printInfo(String name) {
        System.out.println(this.name);
    }

    public void printInfo(int age) {
        this.age = age;
        System.out.println(this.age);
    }


}


public class Main {
    
    public static void main(String args[]) {

        Pen pen1 = new Pen();   // Declaring a pen1 object for Pen Class : Syntax -> Classname var = new Constructors
        pen1.color = "Red";
        pen1.type = "BallPoint";
        pen1.brand = "RedTip";
        pen1.write("Writing the first line with java");

        Pen pen2 = new Pen();   
        pen2.color = "Blue";
        pen2.type = "Fountain";
        pen2.brand = "Royal";
        pen2.write("Writing the first line with java");

        System.out.println("--------------------------------------------------------------------------------");
        // --------------------------------------------------------------------------------

        Student std1 = new Student();
        std1.name = "Aamir";
        std1.age = 15;
        std1.printInfo();
        Student std2 = new Student(std1);
        std2.printInfo();
        std2.printInfo(33);



    }
}