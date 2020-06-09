package ObjectsAndClasses.Inheritance;

import java.util.Date;

//287
public class Inheritances {

    public static void main(String[] args) {

        Employee employee = new Employee("Pep", 2, new Date());
        Manager manager = new Manager("Bill", 10, new Date());

        //manager.setSalary(25);
        //manager.setName("John");
        manager.setBonus(25);

        System.out.println(manager.getSalary());

        Manager boss = new Manager("Carl Cracker", 80000, new Date());
        boss.setBonus(5000);

         Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, new Date());
        staff[2] = new Employee("Tony Tester", 40000, new Date());

        for(Employee e: staff){//e can point to Employee or Manager, this is polymorphism
            System.out.println(e.getName() + " " + e.getSalary());
        }

        //inheritance hierarchies
        Executive exec = new Executive("Bill", 100000, new Date());
        exec.setBonus(100000);
        exec.setSuperBonus(100000);
        System.out.println(exec.getSalary());

        //polymorphism
        Employee e, f, g;
        e = new Employee("John", 200, new Date());
        f = new Manager("John", 200, new Date());
        g= new Executive("John", 200, new Date());

        Employee[] staff1 = new Employee[3];
        staff1[0] = e;
        staff1[1] = f;
        staff[2] = g;


       // staff1[1].setBonus(25)  ERROR, because is declared as employee
        staff1[1] = (Manager) f;
        ((Manager) f).setBonus(25); //by casting it, it works.

        //is legal
        Manager[] managers = new Manager[10];
        Employee[] staff3 = managers; // OK
    }
}
    class Executive extends Manager{

        private double superBonus;

        public Executive(String name, double salary, Date date) {
            super(name, salary, date);
        }

        public void setSuperBonus(double superBonus){
            this.superBonus = superBonus;
        }

        public double getSalary(){
            double baseSalary = super.getSalary();
            return this.superBonus + baseSalary;
        }


    }
    class Employee {
        private String name;
        private double salary;
        private Date hireDate;

        public Employee(String name, double salary, Date date)
        {
          this.name = name;
          this.salary = salary;
          this.hireDate = date;
        }
        public Date getHireDate(){
            return hireDate;
        }

        public void setHireDate(Date date){
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

    class Manager extends Employee {

        private double bonus;

        public Manager(String name, double salary, Date date)
        {
            super(name, salary, date);
            bonus = 0;
        }

        public void setBonus(double bonus){
            this.bonus = bonus;
        }
        public double getSalary(){
            double baseSalary = super.getSalary();
            return baseSalary + this.bonus;
        }

}
