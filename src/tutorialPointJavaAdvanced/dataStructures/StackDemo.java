package tutorialPointJavaAdvanced.dataStructures;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Stack is a subclass of Vector that implements a standard last-in, first-out stack.
 *
 * Stack only defines the default constructor, which creates an empty stack.
 * Stack includes all the methods defined by Vector, and adds several of its own.
 */

public class StackDemo {

    static void showpush(Stack st, int a){
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    static void showpop(Stack st){
        System.out.println("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String[] args) {

        Stack st = new Stack();
        System.out.println("stack: " + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);
        try {
            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }

}
