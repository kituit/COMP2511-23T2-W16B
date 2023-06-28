package youtube;

public class PlayingState extends ViewingState {

    @Override
    public void onPlay(Viewing viewing) {
        viewing.setState(new ReadyState());
    }

    // @Override
    // public ViewingState onPlay2() {
    //     return new ReadyState();
    // }

    @Override
    public void onLock(Viewing viewing) {
        viewing.setState(new LockedState());
    }

    @Override
    public void onNext(Viewing viewing) {
        viewing.playNextVideo();
    }
    
}
