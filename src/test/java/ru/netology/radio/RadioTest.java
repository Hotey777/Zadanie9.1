package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void QuantityStations() {  //Количество радиостанций введены пользователем
        Radio rad = new Radio(20);

        Assertions.assertEquals(20, rad.getMaximStations());
        Assertions.assertEquals(19, rad.getMaxStation());
    }

    @Test
    public void AutoQuantityStations() {  //Количество радиостанций если пользователь ничего не ввел
        Radio rad = new Radio();

        Assertions.assertEquals(10,rad.getMaximStations());
        Assertions.assertEquals(9, rad.getMaxStation());
    }

    @Test
    public void SetNumberStation() {   //Номер текущей радиостанции
        Radio rad = new Radio(20);

        rad.setRadioStation(19);

        Assertions.assertEquals(19, rad.getRadioStation());
    }

    @Test
    public void SetNumberStationMoreLimit() {   //Ввод станции с пульта больше максимальной станции
        Radio rad = new Radio(20);

        rad.setRadioStation(20);

        Assertions.assertEquals(0, rad.getRadioStation());
    }

    @Test
    public void SetNumberStationBelowLimit() {  //Ввод станции с пульта меньше минимальной станции
        Radio rad = new Radio(20);

        rad.setRadioStation(-1);

        Assertions.assertEquals(0, rad.getRadioStation());
    }

    @Test
    public void UpStation() {   //Переключение станции на next при вводе количества станций
        Radio rad = new Radio(20);

        rad.setIncreaseStation(14);

        Assertions.assertEquals(15, rad.getRadioStation());
    }


    @Test
    public void UpStationMoreLimit() {   //Переключение станции на next больше введенного количества станций
        Radio rad = new Radio(20);

        rad.setIncreaseStation(19);

        Assertions.assertEquals(0, rad.getRadioStation());
    }

    @Test
    public void LowStation() {  //Переключение станции на prev при вводе количества станций
        Radio rad = new Radio(20);

        rad.setDecreaseStation(16);

        Assertions.assertEquals(15, rad.getRadioStation());
    }

    @Test
    public void LowStationBelowLimit() {   //Переключение станции на prev меньше 0 при вводе количества станций
        Radio rad = new Radio(20);

        rad.setDecreaseStation(0);

        Assertions.assertEquals(19, rad.getRadioStation());
    }

    @Test
    public void UpVolume() {  //Увеличение громкости на 1
        Radio rad = new Radio(20);

        rad.setIncreaseVolume(88);

        Assertions.assertEquals(89, rad.getCurrentVolume());
    }

    @Test
    public void UpVolumeMoreLimit() {  //Увеличение громкости больше 100
        Radio rad = new Radio(20);

        rad.setIncreaseVolume(100);

        Assertions.assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void LowVolume() {  //Уменьшение громкости на 1
        Radio rad = new Radio(20);

        rad.setDecreaseVolume(75);

        Assertions.assertEquals(74, rad.getCurrentVolume());
    }

    @Test
    public void LowVolumeBelowLimit() { //Уменьшение громкости ниже 0
        Radio rad = new Radio(20);

        rad.setDecreaseVolume(0);

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }
}
