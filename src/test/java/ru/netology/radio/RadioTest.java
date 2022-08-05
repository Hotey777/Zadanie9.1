package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void SetNumberStation() {
        Radio rad = new Radio();

        rad.setRadioStation(9);

        int expected = 9;
        int actual = rad.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetNumberStationMoreLimit() {
        Radio rad = new Radio();

        rad.setRadioStation(10);

        int expected = 0;
        int actual = rad.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetNumberStationBelowLimit() {
        Radio rad = new Radio();

        rad.setRadioStation(-1);

        int expected = 0;
        int actual = rad.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void UpStation() {
        Radio rad = new Radio();

        rad.radioStation = 5;
        rad.increaseStation();

        int expected = 6;
        int actual = rad.radioStation;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void UpStationMoreLimit() {
        Radio rad = new Radio();

        rad.radioStation = 10;
        rad.increaseStation();

        int expected = 0;
        int actual = rad.radioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LowStation() {
        Radio rad = new Radio();

        rad.radioStation = 5;
        rad.decreaseStation();

        int expected = 4;
        int actual = rad.radioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LowStationBelowLimit() {
        Radio rad = new Radio();

        rad.radioStation = -1;
        rad.decreaseStation();

        int expected = 9;
        int actual = rad.radioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void UpVolume() {
        Radio rad = new Radio();

        rad.currentVolume = 7;
        rad.increaseVolume();

        int expected = 8;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void UpVolumeMoreLimit() {
        Radio rad = new Radio();

        rad.currentVolume = 20;
        rad.increaseVolume();

        int expected = 10;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LowVolume() {
        Radio rad = new Radio();

        rad.currentVolume = 2;
        rad.decreaseVolume();

        int expected = 1;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LowVolumeBelowLimit() {
        Radio rad = new Radio();

        rad.currentVolume = -2;
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}
