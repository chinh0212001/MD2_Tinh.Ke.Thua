package CarOng.CarCha;

import CarOng.CarOng;

public class CarCha extends CarOng {

    protected String color = "black";
    protected double price = 5000000;

    public CarCha() {

    }

    public CarCha(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
