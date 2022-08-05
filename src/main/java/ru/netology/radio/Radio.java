package ru.netology.radio;

public class Radio {

    public int radioStation;
    public int currentVolume;

    public int getRadioStation() {

        return radioStation;
    }

    public void setRadioStation(int newRadioStation) {
        if (newRadioStation < 0) {
            return;
        }
        if (newRadioStation > 9) {
            return;
        }
        radioStation = newRadioStation;
    }

    public void increaseStation() {
        if (radioStation < 9) {
            radioStation = radioStation + 1;}
        else {
            radioStation = 0;
        }
    }

    public void decreaseStation() {
        if (radioStation > 0) {
            radioStation = radioStation - 1;}
        else {
            radioStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;}
           else {
               currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;}
        else {
            currentVolume = 0;
        }
    }

}