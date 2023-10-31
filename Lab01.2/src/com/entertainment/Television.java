package com.entertainment;

public class Television {
    private String brand;
    private int volume;
    private Tuner tuner = new Tuner();

    //ctors
    public Television(){}

    public Television(String brand) {
        this();
        setBrand(brand);
    }
    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public int getCurrentChannel() {
        return tuner.getChannel();
    }

    public void changeChannel(int channel) {
        tuner.setChannel(channel);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public String toString() {
        return getClass().getSimpleName() + " Brand: " + getBrand() + ", volume: " + getVolume() +
                ", current channel:" + getCurrentChannel() + ".";
    }


}