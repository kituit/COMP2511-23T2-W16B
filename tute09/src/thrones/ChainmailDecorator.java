package thrones;

public class ChainmailDecorator extends CharacterDecorator {

    public ChainmailDecorator(Character inner) {
        super(inner);
    }

    @Override
    public void damage(int points) {
        super.damage(points / 2);
    }

}
