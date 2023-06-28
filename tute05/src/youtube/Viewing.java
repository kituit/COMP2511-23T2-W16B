package youtube;

import java.util.List;

public class Viewing {
    private ViewingState state;
    private Video currentVideo;
    private List<Video> upNext;

    public void setState(ViewingState state) {
        this.state = state;
    }

    public void playNextVideo() {
        Video next = upNext.remove(0);
        this.currentVideo = next;
    }

    public void onPlay() {
        state.onPlay(this);
        // state = state.onPlay2();
    }

    public void onLock() {
        state.onLock(this);
    }

    public void onNext() {
        state.onNext(this);
    }




}
