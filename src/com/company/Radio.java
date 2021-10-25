package com.company;

public abstract class Radio {
    private final String songName;


    public Radio(String songName) {
        this.songName = songName;
    }

    public String getSongName() {
        return songName;
    }
}
