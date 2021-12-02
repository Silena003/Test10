package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    private final Radio radio = new Radio();


    @Test
    public void setIncreaseVolume() {
        radio.setMaxCurrentVolume(10);
        radio.setMinCurrentVolume(0);
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void setDecreaseVolume() {
        radio.setMaxCurrentVolume(10);
        radio.setMinCurrentVolume(0);
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void setNexCurrentRadioStation() {
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void setPrevCurrentRadioStation() {
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
    }

}