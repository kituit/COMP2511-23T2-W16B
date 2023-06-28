package youtube;

public class Video {
    private String name;
    private int length;
    private Producer creator;
    
    public Video(String name, int length, Producer creator) {
        this.name = name;
        this.length = length;
        this.creator = creator;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public Producer getCreator() {
        return creator;
    }

    public void watchVideo() {
        System.out.println("I am watching this video");
    }

}
