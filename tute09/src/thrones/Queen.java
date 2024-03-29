package thrones;

/**
 * A queen can move to any square in the same column, row or diagonal as she is
 * currently on, and has a 1 in 3 chance of inflicting 12 points of damage or a
 * 2 out of 3 chance of inflicting 6 points of damage.
 *
 * @author Robert Clifton-Everest
 *
 */
public class Queen extends CharacterBase {

    public Queen(int x, int y) {
        super(x, y);
    }

    @Override
    public void attack(Character victim) {
        // has a 1 in 3 chance of inflicting 12 points of damage or a 2 out of 3 chance of inflicting 6 points of damage
        if (Math.random() < 1.0 / 3.0) {
            victim.damage(12);
        } else {
            victim.damage(6);
        }
    }

    @Override
    public boolean canMove(int dx, int dy) {
        // any square in the same column, row or diagonal 

        dx = Math.abs(dx);
        dy = Math.abs(dy);

        return (dx > 0 && dy == 0) || (dx == 0 && dy > 0) || (dx == dy && dx > 0);
    }

}
