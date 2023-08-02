package thrones;

import java.util.List;

public abstract class CharacterDecorator implements Character {
    private Character inner;

    public CharacterDecorator(Character inner) {
        this.inner = inner;
    }

    @Override
    public int getHealthPoints() {
        return inner.getHealthPoints();
    }

    @Override
    public int getX() {
        return inner.getX();
    }

    @Override
    public int getY() {
        return inner.getY();
    }

    @Override
    public void damage(int points) {
        inner.damage(points);
    }

    @Override
    public MoveResult makeMove(int x, int y, List<Character> characters) {
        return inner.makeMove(x, y, characters);
    }

    @Override
    public void attack(Character victim) {
        inner.attack(victim);
    }

    @Override
    public boolean canMove(int dx, int dy) {
       return inner.canMove(dx, dy);
    }
    
}
