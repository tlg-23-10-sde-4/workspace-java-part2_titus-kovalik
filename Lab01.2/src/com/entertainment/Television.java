package com.entertainment;

import java.util.Objects;
/*
 * To be consistent with .equals, whatever fields we use for the equals and hashcode,
 * we must use the same fields for natural order.
 *
 *  That means we'll switch to a primary sort key "Brand" and when tied on brand, we will break the tie
 *  with a secondary sort key with volume
 */
public class Television implements Comparable<Television> {
    private String brand;
    private int volume;
    private final Tuner tuner = new Tuner();

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

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || this.getClass() != obj.getClass()) return false;
//        Television that = (Television) obj;
//        return getVolume() == that.getVolume() && Objects.equals(getBrand(), that.getBrand());
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(getBrand(), getVolume());
//    }

        @Override
    public int hashCode() {

        //this is a poorly written hash function, because it can easily yield "hash collisions."
        //A hash collision is when a "different" object has the same hash code (just by coincident).
        //return getBrand().length() + getVolume(); //<--- sucks
        return Objects.hash(getBrand(), getVolume()); // This one is better
    }

                        //[This is almost always what an equals method check will look like for sets
    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj != null && this.getClass() == obj.getClass()); {
            Television other = (Television) obj;
        if (this.getClass() == obj.getClass()) { // This is an exact check

            result = Objects.equals(this.getBrand(), other.getBrand()) && //null-safe check
                    this.getVolume() == other.getVolume();
            }
        }
        return result;
    }

    @Override
    public int compareTo(Television other) {
           int result = this.getBrand().compareTo(other.getBrand());

           if (result == 0) {
               result = Integer.compare(this.getVolume(), other.getVolume());
           }

           return result;
        }


    public String toString() {
        return getClass().getSimpleName() + " Brand: " + getBrand() + ", volume: " + getVolume() +
                ", current channel:" + getCurrentChannel() + ".";
    }


}