package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void SetNumberStation() {   //Номер текущей радиостанции
        Radio rad = new Radio();

        rad.setRadioStation(9);

        int expected = 9;
        int actual = rad.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetNumberStationMoreLimit() {   //Ввод станции с пульта больше 9
        Radio rad = new Radio();

        rad.setRadioStation(10);

        int expected = 0;
        int actual = rad.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetNumberStationBelowLimit() {  //Ввод станции с пульта меньше 0
        Radio rad = new Radio();

        rad.setRadioStation(-1);

        int expected = 0;
        int actual = rad.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void UpStation() {   //Переключение станции на next
        Radio rad = new Radio();

        rad.setIncreaseStation(5);

        int expected = 6;
        int actual = rad.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void UpStationMoreLimit() {   //Переключение станции на next больше 9
        Radio rad = new Radio();

        rad.setIncreaseStation(10);

        int expected = 0;
        int actual = rad.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LowStation() {  //Переключение станции на prev
        Radio rad = new Radio();

        rad.setDecreaseStation(5);

        int expected = 4;
        int actual = rad.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LowStationBelowLimit() {   //Переключение станции на prev меньше 0
        Radio rad = new Radio();

        rad.setDecreaseStation(-1);

        int expected = 9;
        int actual = rad.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void UpVolume() {  //Увеличение громкости на 1
        Radio rad = new Radio();

        rad.setIncreaseVolume(7);

        int expected = 8;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void UpVolumeMoreLimit() {  //Увеличение громкости больше 10
        Radio rad = new Radio();

        rad.setIncreaseVolume(11);

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LowVolume() {  //Уменьшение громкости
        Radio rad = new Radio();

        rad.setDecreaseVolume(2);

        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LowVolumeBelowLimit() { //Уменьшение громкости ниже 0
        Radio rad = new Radio();

        rad.setDecreaseStation(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
