package thrones;

public class ChestplateDecorator extends CharacterDecorator {

    public ChestplateDecorator(Character inner) {
        super(inner);
    }

    @Override
    public boolean canMove(int dx, int dy) {
        if (Math.abs(dx) + Math.abs(dy) <= 3) {
            return super.canMove(dx, dy);
        } else {
            return false;
        }
    }

    @Override
    public void damage(int points) {
        super.damage(Math.min(points, 7));
    }

}
