package youtube;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void subscribeTo(Producer producer) {
        producer.addSubscriber(this);
    }

    // Push observer pattern
    public void notify(Video video) {
        video.watchVideo();
    }

    // Pull observer pattern
    public void notify(Producer producer) {
        Video video = producer.getLatestVideo();
        video.watchVideo();
    }


}
