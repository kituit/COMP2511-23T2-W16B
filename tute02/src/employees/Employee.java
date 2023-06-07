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


    // public boolean equals(Employee e) {
    //     return this.name.equals(e.name) && this.salary == e.salary;
    // }

    // Added VSCode autogenerated equals method
    // right click -> source action  -> Generate hash code an equals
    @Override
    public boolean equals(Object obj) {
        // We're receiving some other Object.
        // This could be anything (not neccessarily another Employee object)
        
        // Step 1: Check if the other object is literally the same object as this current 
        // object (i.e they are the same objects in memory, so this == obj is true as they point
        // to the same block of memory)
        // 
        // If they are the same object, then we know they must be equal, so return true
        if (this == obj) 
            return true;

        // Step 2: Check if the other object is null (any object variable can be null in java so need to deal with)
        //
        // If the other object is null (and this object obviously isn't null), so they must not be equal,
        // so return false
        if (obj == null)
            return false;

        // Step 3: Check if the other object is also an Employee.
        // E.g calling getClass on an Employee returns Employee, calling getClass on a Manager returns Manager, etc
        // 
        // If the other object is not the same class as the current object, we know they cannot be equal, so
        // return false
        if (getClass() != obj.getClass())
            return false;

        // At this point we know:
        //  - The other object is not null
        //  - The other object is the same class as the current object
        // We can therefore safely cast this object as an Employee
        Employee other = (Employee) obj; // *Casting*: Telling java to treat this object as an Employee object
        
        // Step 4: Compare the name and salary variables of each Employee
        // VsCode goes a little overboard here and is first doing some null checks for the name variables.
        // This is technically best practice as name could theorhetically be null, so doing name.equals(other.name)
        // could cause a null pointer exception. Just something to be aware of, although for the purposes of this
        // course probably a bit overboard
        //
        // If the name or salary variables are not equal, return false, else return true.
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
