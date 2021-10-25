package com.company;

public class Main {

    public static void main(String[] args) {
        FirstRadioStation song1 = new FirstRadioStation("lalalilula");
        SecondRadioStation song2 = new SecondRadioStation("ulala");
        ThirdRadioStation song3 = new ThirdRadioStation("elololi");

        song1.play();
        song1.stop();
        song2.play();
        song2.stop();
        song3.play();
        song3.stop();
    }
}
