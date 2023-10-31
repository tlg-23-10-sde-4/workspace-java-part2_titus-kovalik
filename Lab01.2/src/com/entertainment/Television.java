package com.entertainment;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        //this is a poorly written hash function, because it can easily yield "hash collisions."
        //A hash collision is when a "different" object has the same hash code (just by coincident).
//        return getBrand().length() + getVolume(); <--- sucks
        return Objects.hash(getBrand(), getVolume()); // This one is better
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj instanceof Television) {
            Television other = (Television) obj;

            result = Objects.equals(this.getBrand(), other.getBrand()) && //null-safe check
                    this.getVolume() == other.getVolume();
        }

        return result;
    }
    public String toString() {
        return getClass().getSimpleName() + " Brand: " + getBrand() + ", volume: " + getVolume() +
                ", current channel:" + getCurrentChannel() + ".";
    }


}