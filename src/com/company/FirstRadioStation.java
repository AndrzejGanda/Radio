package com.company;

public class FirstRadioStation implements RadioStation {
    private final String songName;


    public FirstRadioStation(String songName) {
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
