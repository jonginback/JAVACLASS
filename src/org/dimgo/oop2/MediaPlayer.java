package org.dimgo.oop2;

public class MediaPlayer {
    private int volume;

    public static MediaPlayer getInstance() {
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private static MediaPlayer instance = new MediaPlayer();

    private MediaPlayer() {}

}

