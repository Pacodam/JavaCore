package ObjectsAndClasses.Inheritance;

import java.util.Date;

public class Casting {

    public static void main(String[] args) {

        double x = 3.405;
        int y = (int) x;

        Employee1 e, f, g;
        e = new Employee1("John", 200, new Date());
        f = new Manager1("John", 200, new Date());
        g = new Executive1("John", 200, new Date());

        Employee1[] staff1 = new Employee1[3];
        staff1[0] = e;
        staff1[1] = f;
        staff1[2] = g;


        // staff1[1].setBonus(25)  ERROR, because is declared as employee
        staff1[1] = (Manager1) f;
        ((Manager1) f).setBonus(25); //by casting it, it works.

        Manager1 boss = (Manager1) staff1[2];

        //checking type to ensure casting
        if (staff1[1] instanceof Manager1)
        {
           // boss = (Manager) staff1[1];

        }

       // In general, it  is best to minimize the use of casts and the instanceof operator

    }
}


    class Executive1 extends Manager1 {

        private double superBonus;

        public Executive1(String name, double salary, Date date) {
            super(name, salary, date);
        }

        public void setSuperBonus(double superBonus) {
            this.superBonus = superBonus;
        }

        public double getSalary() {
            double baseSalary = super.getSalary();
            return this.superBonus + baseSalary;
        }


    }

    class Employee1 {
        private String name;
        private double salary;
        private Date hireDate;

        public Employee1(String name, double salary, Date date) {
            this.name = name;
            this.salary = salary;
            this.hireDate = date;
        }

        public Date getHireDate() {
            return hireDate;
        }

        public void setHireDate(Date date) {
            this.hireDate = date;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }

    class Manager1 extends Employee1 {

        private double bonus;

        public Manager1(String name, double salary, Date date) {
            super(name, salary, date);
            bonus = 0;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }

        public double getSalary() {
            double baseSalary = super.getSalary();
            return baseSalary + this.bonus;
        }


}

