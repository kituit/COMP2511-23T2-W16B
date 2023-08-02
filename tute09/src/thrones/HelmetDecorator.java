package thrones;

public class HelmetDecorator extends CharacterDecorator {
    
    public HelmetDecorator(Character inner) {
        super(inner);
    }

    @Override
    public void damage(int points) {
        super.damage(Math.max(0, points - 1));
    }

    
}
