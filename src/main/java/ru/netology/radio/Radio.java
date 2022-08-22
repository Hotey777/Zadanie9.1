package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int maxStation;
    private int minStation = 0;
    private int radioStation;
    private int maximStations;

    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int stations) {  //Если пользователь захотел указать количество станций
        maximStations = stations;
        maxStation = maximStations - 1;
    }

    public Radio() {  //Если пользователь не захотел указывать количество станций
        maximStations = 10;
        maxStation = maximStations -1;
    }

    public int getRadioStation() {
        return radioStation;
    }

    public int getMaximStations() {
        return maximStations;
    }
    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setRadioStation(int newRadioStation) {
        if (newRadioStation < minStation) {
            return;
        }
        if (newRadioStation > maxStation) {
            return;
        }
        radioStation = newRadioStation;
    }

    public void setIncreaseStation(int newRadioStation) {
        if (newRadioStation < maxStation) {
            radioStation = newRadioStation + 1;
        } else {
            radioStation = minStation;
        }
    }

    public void setDecreaseStation(int newRadioStation) {
        if (newRadioStation > minStation) {
            radioStation = newRadioStation - 1;
        } else {
            radioStation = maxStation;
        }
    }

    public void setIncreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < maxVolume) {
            currentVolume = newCurrentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void setDecreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume > minVolume) {
            currentVolume = newCurrentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }

}