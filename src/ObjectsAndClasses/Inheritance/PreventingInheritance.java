package ObjectsAndClasses.Inheritance;

import java.util.Date;

public class PreventingInheritance {

    public static void main(String[] args){

    }

    //final: classes that cannot be extended
    final class Executive extends Manager{

        private double superBonus;

        public Executive(String name, double salary, Date date) {
            super(name, salary, date);
        }

        public void setSuperBonus(double superBonus){
            this.superBonus = superBonus;
        }

        //final method: no subclass can override method
        public final double getSalary(){
            double baseSalary = super.getSalary();
            return this.superBonus + baseSalary;
        }
    }

    //ILLEGAL
   /* class Chief extends Executive{
        public Chief(String name, double salary, Date date) {
            super(name, salary, date);
        }
    }*/
}
