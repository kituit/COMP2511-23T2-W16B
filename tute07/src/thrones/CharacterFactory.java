package thrones;

import java.util.Random;

public class CharacterFactory {
    
    // Coding something truely random is difficult
    private static Random random =  new Random(System.currentTimeMillis());

    private static int getCoordinate() {
        return random.nextInt(5); // I want a number 0 <-> 4 (inclusive)
    }

    public static King createKing() {
        return new King(getCoordinate(), getCoordinate());
    }

    public static Queen createQueen() {
        return new Queen(getCoordinate(), getCoordinate());
    }

    public static Dragon createDragon() {
        return new Dragon(getCoordinate(), getCoordinate());
    }

    public static Knight createKnight() {
        return new Knight(getCoordinate(), getCoordinate());
    }
}


// public class Random {
//     private int seed;

//     public Random(int seed) {
//         this.seed = seed;
//     }

//     // If i have two random objects with seed = 10
//     // I will always get the sequence 10, 110, 210, 310, 410, etc

//     public int nextInt() {
//         seed += 100;
//         // Does some more sophisticated algorithm for choosing the next number
//         // to "appear" more random
//         return seed;
//     }
    
// }