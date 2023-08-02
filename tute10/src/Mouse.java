
public class Mouse implements ComputerComponent {
    private String name;

    public Mouse(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }

    // @Override
    // public void visit() {
    //     System.out.println("Looking at mouse " + name + " mouse.");
    // }
    
    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visitMouse(this);
    }
}