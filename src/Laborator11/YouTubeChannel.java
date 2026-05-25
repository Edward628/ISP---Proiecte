package Laborator11;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    private String channelName;
    private List<Observer> observatori = new ArrayList<>();

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void addObserver(Observer o) {
        observatori.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observatori.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observatori) {
            o.update(message);
        }
    }

    public void uploadVideo(String title) {
        System.out.println("{" + channelName + "} uploaded a new video: " + title);
        notifyObservers(title);
    }
}