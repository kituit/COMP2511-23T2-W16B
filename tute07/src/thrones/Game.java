package thrones;

public class Game {
    
    public static void main(String[] args) {

        // CharacterFactory cf = new CharacterFactory();

        King king = CharacterFactory.createKing();
        Queen queen = CharacterFactory.createQueen();
        Knight knight = CharacterFactory.createKnight();
        Dragon dragon = CharacterFactory.createDragon();

        knight.attack(dragon);
    }

}