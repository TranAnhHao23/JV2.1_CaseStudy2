package model;

public class Service {
    private double price;
    private int quantity;

    public Service() {
    }

    public Service(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Service{" +
                "price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
