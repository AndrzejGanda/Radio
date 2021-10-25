package com.company;

import java.util.Scanner;

public  class Radio {


    public void SelectedStation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj stacie której chcesz słuchać(cyfra od 1 do 3)");
        int radioSt= scanner.nextInt();
        if(radioSt==1){
            FirstRadioStation song = new FirstRadioStation("lalala");
            song.play();
        }else if(radioSt==2){
            SecondRadioStation song = new SecondRadioStation("uuuuulalalla");
            song.play();
        }else if(radioSt==3){
            ThirdRadioStation song = new ThirdRadioStation("uuuuulalalla");
            song.play();
        }else{
            System.out.println("wrong number");
        }
    }

}
