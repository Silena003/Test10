package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int maxRadioStation;
    private int minRadioStation;
    private int currentVolume;
    private int minCurrentVolume;
    private int maxCurrentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getMinCurrentVolume() {
        return minCurrentVolume;
    }

    public void setMinCurrentVolume(int minCurrentVolume) {
        this.minCurrentVolume = minCurrentVolume;
    }

    public int getMaxCurrentVolume() {
        return maxCurrentVolume;
    }

    public void setMaxCurrentVolume(int maxCurrentVolume) {
        this.maxCurrentVolume = maxCurrentVolume;
    }

    public void setIncreaseVolume(int currentVolume) {
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        }
    }
    public void setDecreaseVolume(int currentVolume) {
        if (currentVolume > 0 ) {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void setNexCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            if (currentRadioStation < 9) {
                this.currentRadioStation = currentRadioStation;
            }
        }
    }
    public void setPrevCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 0 ) {
            if (currentRadioStation < 0) {
                this.currentRadioStation = currentRadioStation;
            }
        }

    }
}
