
/* INHERITANCE IN JAVA [ To gain or inherit the properties of parent class ]
 * Types of Inheritance 
 *  -   Single Level Inheritance [ Only a single class extends base class ]
 *  -   Multi Level Inheritance  [ Multiple Child Classes nesting Parent Class ]
 *  -   Hirerichal Inheritance   [ Multiple Child Classes extends the same Base Class ]
 *  -   Hybird Inheritance       [ Combination of All the above inheritances ]
 * 
 */

 
 enum Gender {
    MALE,
    FEMALE,
    PREFER_NOT_TO_SAY
 }


class Human {               // BASE CLASS

    String skinColor;
    String name;
    String gender;

    public void walking() {
        System.out.println("Walking ......");
    }

}

// ----------------------------- Single Level Inheritance --------------------------- //

class Man extends Human {   // DERIVED CLASS extends BASE CLASS 
    String gender = "Male";

    public void walking() {
        System.out.println("Man is walking.....");
    }
}
// ----------------------------- Hirerichal Inheritance --------------------------- //

class Women extends Human {
    String gender = "women";

    public void walking() {
        System.out.println("Women is walking.....");
    }
}

// ----------------------------- Multi Level (2nd) Inheritance --------------------------- //

class Boy extends Man {
    public void walking() {
        System.out.println("Boy is walking......");
    }
}


public class Inheritance {
    public static void main(String[] args) {
    
        Man man = new Man();
        System.out.println(man.gender);

    }
}
