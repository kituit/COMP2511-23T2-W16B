package employees;

import java.time.LocalDate;

public class Manager extends Employee {

    private final LocalDate hireDate;

    public Manager(String name, int salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    // This is fine
    public LocalDate getHireDate() {
        return hireDate;
    }

    // Probably we don't 
    // public void setHireDate(LocalDate hireDate) {
    //     this.hireDate = hireDate;
    // }

    // public String toString() {
    //     return "Manager [name=" + getName() + ", salary=" + getSalary() + ", hiredate=" + hireDate + "]";
    // }

    @Override
    public String toString() {
        return super.toString() + "[hiredate = " + hireDate + "]";
    }

    public static void main(String[] args) {
        Manager m1 = new Manager("Kit", 0, LocalDate.now());
        Manager m2 = new Manager("Kit", 0, LocalDate.now());

        // == Compares memory references

        System.out.println(m1 == m2);
    }

    

    
    
}
