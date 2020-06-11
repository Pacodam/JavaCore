package InheritanceAndLambdas;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.*;

//398
public class Interfaces {
    //interfaces: what classes should-do, not how-they-do-it
    //a class can implemente one or more interfaces
    public static void main(String[] args) {

        Worker[] staff = new Worker[3];

        staff[0] = new Worker("Harry Hacker", 35000);
        staff[1] = new Worker("Carl Cracker", 75000);
        staff[2] = new Worker("Tony Tester", 38000);
        Arrays.sort(staff);

        // print out information about all Employee objects
        for (Worker e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());


        //interfaces are not classes. You cannot use new operater to instatiate an interface
        //you can declare interface variables
        //an interface variable must refer to an object of a class that implements the interface
        Comparable x;
        x = new Worker("John", 34);
        //using instaceof to check wheter an object implements an interface
        //if(anObject instanceOf Comparable) { ...}

        //one class can implement more than one interface, separated by commas

        //interfaces and callbacks = the callback pattern
        TimePrinter listener = new TimePrinter();
        Timer t = new Timer(1000, listener);
        //t.start();

        // keep program running until the user selects "OK"
        //JOptionPane.showMessageDialog(null, "Quit program?");
        //System.exit(0);

        //the Comparator Interface : comparing Strings by length
        String[] friends = {"Peter", "Mary", "William"};
        Arrays.sort(friends, new LengthComparator());
        System.out.println(friends[0] + " " +  friends[1] + " " + friends[2]);


        //Object Cloning : Cloneable interface

        //copy : same reference
        Worker original = new Worker("John", 1000);
        Worker copy = original;
        copy.raiseSalary(10);
        System.out.println(original.getSalary());

        //clone : copy without same reference
        /*try {
            Worker clone = cloneWorker(original); //requires non-static context
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }*/



    }

    public Worker cloneWorker(Worker worker) throws CloneNotSupportedException{
        return (Worker) super.clone();
    }

}

//comparator by length
class LengthComparator implements Comparator<String> {
    public int compare(String first, String second) {
        return first.length() - second.length();
    }
}

//callback example
class TimePrinter implements ActionListener{
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("At the tone, the time is "
                + Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}

//interfaces can be extended by another one
interface Powered extends Moveable {
    double milesPerGallon();
    double SPEED_LIMIT = 95; // a public static final constant
}

interface Moveable{
    void move(double x, double y);
}

class Worker implements Comparable<Worker>, Cloneable {

    private String name;
    private double salary;


    public Worker(String name,double salary) {
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
         return name;
    }
    public double getSalary() {
         return salary;
    }

    // public access, change return type
    public Worker clone() throws CloneNotSupportedException
    {
        return (Worker) super.clone();
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
         }


     /**
  * Compares workers by salary
  * @param other another Worker object
  * @return a negative value if this worker has a lower salary than other
  * otherObject, 0 if the salaries are the same, a positive value otherwise
  */
    public int compareTo(Worker other) {
        return Double.compare(salary, other.salary);
    }

}
