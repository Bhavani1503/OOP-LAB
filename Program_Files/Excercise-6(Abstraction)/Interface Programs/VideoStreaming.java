class Video {
    private String title;
    private boolean isPremium;

    public Video(String title, boolean isPremium) {
        this.title = title;
        this.isPremium = isPremium;
    }

    public String getTitle() {
        return title;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void watchVideo(boolean hasSubscription) {
        if (!isPremium || hasSubscription) {
            System.out.println("Playing: " + title);
        } else {
            System.out.println("This is a premium video. Please subscribe to watch.");
        }
    }
}

public class VideoStreaming {
    public static void main(String[] args) {
        Video video1 = new Video("Tech Trends 2025", false);
        Video video2 = new Video("Exclusive Movie Premiere", true);

        System.out.println("Video: " + video1.getTitle());
        video1.watchVideo(false);

        System.out.println("Video: " + video2.getTitle());
        video2.watchVideo(false);
        video2.watchVideo(true);
    }
}
