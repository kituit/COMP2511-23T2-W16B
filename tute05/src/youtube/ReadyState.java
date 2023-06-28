package youtube;

public class ReadyState extends ViewingState {

    @Override
    public void onPlay(Viewing viewing) {
        viewing.setState(new PlayingState());
    }

    @Override
    public void onLock(Viewing viewing) {
        viewing.setState(new LockedState());
    }

    @Override
    public void onNext(Viewing viewing) {
        throw new RuntimeException("Error: Currently paused");
    }
    
}
