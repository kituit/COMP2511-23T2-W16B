package youtube;

public class LockedState extends ViewingState {

    @Override
    public void onPlay(Viewing viewing) {
        viewing.setState(new ReadyState());
    }

    @Override
    public void onLock(Viewing viewing) {
        viewing.setState(new ReadyState());
    }

    @Override
    public void onNext(Viewing viewing) {
        throw new RuntimeException("Error, Currently lock");
    }
    
}
