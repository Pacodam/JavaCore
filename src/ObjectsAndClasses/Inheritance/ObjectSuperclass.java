package ObjectsAndClasses.Inheritance;

import java.util.Date;
import java.util.Objects;

public class ObjectSuperclass {

    public static void main(String[] args){

        Object object = new Employee2("John", 250, new Date());
        Employee2 e = (Employee2) object;
//        In Java, only the values of primitive types (numbers, characters, and
//        boolean values) are not objects.

        //Equals
        Employee2 f = new Employee2("John", 250, new Date());
        System.out.println(e.equals(f));

        //If you redefine equals in a subclass, include a call to
        //super.equals(other)

        //hashCode
        System.out.println(e.hashCode());
        System.out.println(f.hashCode());

        //toString
        System.out.println(e.toString());
    }
}

class Employee2 {
    private String name;
    private double salary;
    private Date hireDate;

    public Employee2(String name, double salary, Date date) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee2 = (Employee2) o;
        return Double.compare(employee2.salary, salary) == 0 &&
                Objects.equals(name, employee2.name) &&
                Objects.equals(hireDate, employee2.hireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDate);
    }

    @Override
    public String toString() {
        return getClass().getName() + " " +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }
}

