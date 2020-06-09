package ObjectsAndClasses.Inheritance;

public class AbstractClass {

    public static void main(String[] args) {

        //access modificators
      /*  1. Accessible in the class only (private).
        2. Accessible by the world (public).
        3. Accessible in the package and all subclasses (protected).
        4. Accessible in the package—the (unfortunate) default. No modifiers are needed*/
    }
}

/**
 * Class that cannot be instantiated. Act as placeholders that are implemented
 * in the subclasses.
 */
abstract class Person{

        private String name;
        public Person(String name)
        {
            this.name = name;
        }
        public abstract String getDescription();
        public String getName()
        {
            return name;
        }
    }

class Student extends Person {
    private String major;
    public Student(String name, String major)
    {
        super(name);
        this.major = major;
    }
    public String getDescription() {
       return "a student majoring in " + major;
    }
}


