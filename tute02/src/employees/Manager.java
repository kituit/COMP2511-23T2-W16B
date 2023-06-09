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

    // Added VSCode autogenerated equals method
    // right click -> source action  -> Generate hash code an equals
    @Override
    public boolean equals(Object obj) {
        // Now writing equals method for a Manager
        // We want two Managers to be considered equal
        // if they have the same name, salary and hireDate
        // However, we've already written a bunch of code in the Employee class
        // to handle if the name and salary are the same (along with null checks etc).
        // So we're going to use super.equals() here to handle all of that for us,
        // so all we need to do here is check the hire dates
        
        // Step 1: Check if the two objects are the same.
        if (this == obj)
            return true;

        // Step 2: Call super.equals() to handle all of:
        // - If other object is null
        // - If other object is not the same class as this object
        // - If other object has different name and salary
        if (!super.equals(obj))
            return false;

        // At this point we know that the other object has the same name and salary as this object
        // So we just need to compare the hire dates
        if (getClass() != obj.getClass())
            return false;
        Manager other = (Manager) obj; // *casting* other object as a Manager
        
        // Ifthe hireDates are equal, theen return true
        // Again for purposes of this course a little overkill here to do all this null checking 
        // but techically the most correct way to do
        if (hireDate == null) {
            if (other.hireDate != null)
                return false;
        } else if (!hireDate.equals(other.hireDate))
            return false;
        return true;
    }


    
    

    
    
}
