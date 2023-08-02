import java.util.ArrayList;
import java.util.List;

public class ComputerVisitor {

    public static void main(String[] args) {
        ComputerComponent computer = new Computer("Corelli", 500);
        ComputerComponent keyboard = new Keyboard("Mechanical keyboard");
        ComputerComponent mouse = new Mouse("Bluetooth mouse");
        ComputerVisitor visitor = new ComputerVisitor();
        List<ComputerComponent> components = new ArrayList<>();

        components.add(computer);
        components.add(mouse);
        components.add(keyboard);

        for (ComputerComponent component : components) {
            component.accept(visitor);
        }

    }

    // public void visit(ComputerComponent component) {

    // }

    public void visitComputer(Computer computer) {
        System.out.println("Looking at computer " + computer + " with memory " + computer.getMemory() + " GB.");
    }

    public void visitKeyboard(Keyboard keyboard) {
        System.out.println("Looking at keyboard " + keyboard + " keyboard which has " + keyboard.getNumKeys() + " keys.");
    }

    public void visitMouse(Mouse mouse) {
        System.out.println("Looking at mouse " + mouse + " mouse.");
    }

}