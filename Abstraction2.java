/*
 * Abstraction with the help of INTERFACES
 * Multiple Inheritance  
 * static keyword  [ Used for the info that all the objects of a class have same ]
*/


class Hello {
    static String greeting = "Hye";
}

interface Animal {          // Interface defiens a complete Abstract Class 
    int eyes = 2;           // Attributes are always public [ Accessible to all ] static [ Same for all ] final [ constant cannot be change ]
    void walk();            // Methods are public [ availabe to all that's why we dont defined any access modifier ]  and abstract by default
    // void eat() {         // Cannot create a non abstract method in interface

    // }
}

interface Herbivorous {
    void eatGrass();
}

class Horse implements Animal, Herbivorous {
    public void walk() {
        System.out.println("Walk on 4 legs");
    }
    public void eatGrass() {
        System.out.println("Horse Eat Gass");
    }
}

public class Abstraction2 {
    public static void main(String[] args) {
        
        System.out.println(Hello.greeting);
    }
}
