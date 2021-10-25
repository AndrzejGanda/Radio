package com.company;

public class SecondRadioStation extends Radio implements Possibilities{


    public SecondRadioStation(String songName) {
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
