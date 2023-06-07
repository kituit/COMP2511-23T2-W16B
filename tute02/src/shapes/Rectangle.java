package shapes;

import employees.Employee;

public class Rectangle extends Shape {
    public int height;
    public int width;
    
    public String color;


    // Constructor function
    public Rectangle(String color) {
        super(color); // This always has to be done on the first line
        System.out.println("Inside Rectangle constructor with one argument");
    }

    // Constructor functions
    public Rectangle(String name, int width, int height) {
        this(name); // Calls the constructor function on line 11
        this.width = width;
        this.height = height;
        System.out.println("Inside Rectangle constructor with three arguments");
    }

    public void doSomething() {
        System.out.println(this.color);
        System.out.println(super.color);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle("red", 10, 20);

        Employee e = new Employee("Kit", 100);
        int temp = e.salary;
        int name = e.name;

    }
}
