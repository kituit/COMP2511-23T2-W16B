public class Computer implements ComputerComponent {

    private String name;
    private int memory;

    public Computer(String name, int memory) {
        this.name = name;
        this.memory = memory;
    }
    
    @Override
    public String toString() {
        return name;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visitComputer(this);
    }

    // @Override
    // public void visit() {
    //     System.out.println("Looking at computer " + name + " with memory " + memory + " GB.");
    // }

    

}