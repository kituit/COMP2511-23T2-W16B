package thrones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Plays the game with a command line interface.
 * 
 * @author Nick Patrikeos
 */
public class Game {
    
    private List<Character> characters = new ArrayList<Character>();

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        
        for (Character character : characters) {
            System.out.print("Move " + character + " to: ");
            String[] line = scanner.nextLine().split(" ");
            x = Integer.parseInt(line[0]);
            y = Integer.parseInt(line[1]);

            MoveResult result = character.makeMove(x, y, characters);
            
            if (result.equals(MoveResult.SUCCESS)) {
                System.out.println("Success! Character is now " + character);
            } else if (result.equals(MoveResult.INVALID)) {
                System.out.println("Invalid move.");
            } else if (result.equals(MoveResult.ATTACK)) {
                System.out.println("Attacked another character.");
            }
        }

        scanner.close();
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }
    
    
    public static void main(String[] args) {
        // Game game = new Game();

        /*
        game.addCharacter(new King(0, 0));
        game.addCharacter(new Dragon(0, 1));
        game.addCharacter(new Queen(2, 2));
        */

        // game.play();





        Character king = new King(0, 0);
        System.out.println("Initial health: " + king.getHealthPoints());
        
        king.damage(5);
        System.out.println("Taken damage: " + king.getHealthPoints()); // health should have reduced by 5 points
        
        king = new ChainmailDecorator(king);
        king.damage(5);
        System.out.println("Taken damage: " + king.getHealthPoints()); // health should have reduced by 5/2 = 2 points
        king = new HelmetDecorator(king);
        king = new ChestplateDecorator(king);
        king.damage(10);




    }



Employee e = new Director()
e.addEmployee();

if (e instanceof Director) {
    ((Director) e).addEmployee();
}

Manager m = new Director();
m.approveExprense();
if (e instanceof) {
    ((Director) m).approveExprense();
}




public class Account {
    private double balance;
    public Account (double balance) { this.balance = balance; }

    // other getter and setter for balance
}
public class Savings extends Account {
    private double interestRate;
    
    public Savings(double rate) {
        super(100);
        this.interestRate = rate;
    }
}

}   