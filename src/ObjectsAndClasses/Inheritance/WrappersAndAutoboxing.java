package ObjectsAndClasses.Inheritance;

import java.util.ArrayList;

public class WrappersAndAutoboxing {
    public static void main(String[] args) {
      /*  All primitive types have class counterparts. For example, a class Integer
        corresponds to the primitive type int. These kinds of classes are usually
        called wrappers. The wrapper classes have obvious names: Integer,
                Long, Float, Double, Short, Byte, Character, and Boolean. (The
        first six inherit from the common superclass Number.) The wrapper classes
        are immutable—you cannot change a wrapped value after the wrapper has
        been constructed. They are also final, so you cannot subclass them.*/

        //type parameter inside angle brackets cannot be a primitive type
        //ArrayList<int> list = new ArrayList<>(); illegal
        ArrayList<Integer> list = new ArrayList<>();

        //autoboxing
        list.add(3); //automatic conversion from int to Integer.
        Integer a = list.get(0);
        int b = list.get(0);  //automatic unboxing also

        //comparing wrappers: better use equals method!
        Integer c = 1000;
        Integer d = 1000;
        if (c == d) {//... } //may fail

            //autounboxing cons
            Integer n = null;
            System.out.println(2 * n); // throws NullPointerException

            Integer m = 1;
            Double x = 2.0;
            System.out.println(true ? m : x); // prints 1.0
        }
    }
}
