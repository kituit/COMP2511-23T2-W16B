package youtube;

public abstract class ViewingState {
    
    public abstract void onPlay(Viewing viewing);

    // public abstract ViewingState onPlay2();

    public abstract void onLock(Viewing viewing);

    // public abstract ViewingState onLock2();

    public abstract void onNext(Viewing viewing);

    // public abstract ViewingState onNext2();
}
