/*
 * Abstraction : To hide unnecessary info from users
 *  - abstract keyword used for Abstraction
 */

abstract class Animal {         // We cannot Create any instance from it bcz it's just a concept ( Cannot intantiated )

    Animal() {                  // Constructor [ Once the object or instance of child class created first this will render, and then the constrauctor of child will execute this called constructor chaining ]
        System.out.println("Animal Created");
    }

    abstract void walk();       // this walk function should be present in Child Classes

    public void eat() {         // Normal Function

    }
}
class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    } 
}
class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        
    }
}
