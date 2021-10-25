package com.company;

public class ThirdRadioStation extends Radio implements Possibilities{


    public ThirdRadioStation(String songName) {
        super(songName);
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
