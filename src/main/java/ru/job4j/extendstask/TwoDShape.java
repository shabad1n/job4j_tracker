package ru.job4j.extendstask;

 class TwoDShape {
    private double width;
    private double height;

    TwoDShape(double a) {
        width = a;
    }

    TwoDShape(double a, double b) {
        width = a;
        height = b;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
