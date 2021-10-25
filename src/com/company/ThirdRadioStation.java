package com.company;

public class ThirdRadioStation implements RadioStation {
    private final String songName;

    public ThirdRadioStation(String songName) {
        this.songName = songName;
    }

    public String getSongName() {
        return songName;
    }

    @Override
    public void play() {
        System.out.println("song: " + getSongName());
    }

    @Override
    public void stop() {
        System.out.println("song: " + getSongName() + " is stopped");
    }
}
