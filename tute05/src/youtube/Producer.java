package youtube;

import java.util.ArrayList;
import java.util.List;

public class Producer {
    private String name;
    private List<Video> videos = new ArrayList<>();
    private List<User> subscribers = new ArrayList<>();

    public Producer(String name) {
        this.name = name;
    }

    // 1st part: Oberver tells producer to notify it when something happens
    public void addSubscriber(User newSubscriber) {
        subscribers.add(newSubscriber);
    }

    public void uploadVideo(Video newVideo) {
        videos.add(newVideo);

        // 2nd part: Producer notifies Observer
        for (User subscriber : subscribers) {
            subscriber.notify(newVideo);
        }

        // 2nd part alternative with pull observer
        for (User subscriber : subscribers) {
            subscriber.notify(this);
        }
    }

    public Video getLatestVideo() {
        return null;
    }



}
