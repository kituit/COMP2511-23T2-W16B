
public class Shouter {
    private String message;

    public Shouter(String myMessage) {
        this.message = myMessage;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String myMessage) {
        this.message = myMessage;
    }

    public void shout() {
        System.out.println(this.message.toUpperCase());
    }

    public static void main(String[] args) {
        Shouter shouter1 = new Shouter("Hello");
        Shouter shouter2 = new Shouter("Goodbye");

        String message = shouter1.getMessage();
        System.out.println(message); // Print Hello

        shouter1.setMessage("Hi");
        message = shouter1.getMessage();
        System.out.println(message); // Print Hi

        shouter1.shout(); // Print HI
    }

}
