package com.company;

public class FirstRadioStation extends Radio implements Possibilities{


    public FirstRadioStation(String songName) {
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
