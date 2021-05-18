package giftModel;

public class gift {
    private int id, qty;
    private String name;
    private double price;

    public gift(int id, double price, int qty, String name) {
        this.id = id;
        this.price = price;
        this.qty = qty;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
