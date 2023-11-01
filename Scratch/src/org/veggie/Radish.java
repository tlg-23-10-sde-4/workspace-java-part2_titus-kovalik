package org.veggie;

//Natural order is defined by size (double)
class Radish implements Comparable<Radish>{

    //Fields
    public String color;
    public double size;
    public double tailSize;
    public int sprouts;


    // Constructors
    public Radish(String color, double size, double tailSize, int sprouts) {
       setColor(color);
       setSize(size);
       setTailSize(tailSize);
       setSprouts(sprouts);
    }


    // Accessors
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getTailSize() {
        return tailSize;
    }

    public void setTailSize(double tailSize) {
        this.tailSize = tailSize;
    }

    public int getSprouts() {
        return sprouts;
    }

    public void setSprouts(int sprouts) {
        this.sprouts = sprouts;
    }

    //Natural order is defined by size (double)
    @Override
    public int compareTo(Radish other) {
        return Double.compare(this.getSize(), other.getSize());
    }

    @Override
    public String toString() {
        return String.format("%s: color: %s, size: %s, tailLength: %s, sprouts: %s ",
                getClass().getSimpleName(), getColor(), getSize(), getTailSize(), getSprouts());
    }


}