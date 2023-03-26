package ro.sda.advanced._3_composition;

public class Dimensions {
    private double width;
    private double height;
    private double death;

    public Dimensions(double width, double height, double death) {
        this.width = width;
        this.height = height;
        this.death = death;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDeath() {
        return death;
    }
}
