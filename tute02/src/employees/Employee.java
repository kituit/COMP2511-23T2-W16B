package employees;

public class Employee {
    private String name; // This represents the name of an employee
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name) {
        this.name = name;
        this.salary = 0;
    }
    
    /**
     * Returns the name of the Employee
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        // name = "Kit", salary = 10
        // "Employee [name=Kit, salary=100]"
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }

    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((name == null) ? 0 : name.hashCode());
    //     result = prime * result + salary;
    //     return result;
    // }


    public boolean equals(Employee e) {
        return this.name.equals(e.name) && this.salary == e.salary;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (salary != other.salary)
            return false;
        return true;
    }

    
    
    

}
