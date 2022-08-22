package ru.netology.radio;

public class Radio {

    private int radioStation;
    private int currentVolume;

    public int getRadioStation() {

        return radioStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
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

    public void setIncreaseStation(int newRadioStation) {
        if (newRadioStation < 9) {
            radioStation = newRadioStation + 1;
        } else {
            radioStation = 0;
        }
    }

    public void setDecreaseStation(int newRadioStation) {
        if (newRadioStation > 0) {
            radioStation = newRadioStation - 1;
        } else {
            radioStation = 9;
        }
    }

    public void setIncreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 10) {
            currentVolume = newCurrentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }

    public void setDecreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
            currentVolume = newCurrentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

}