package self.model;

public abstract class Customer {

    String name;
    String surname;

    public Customer() {
    }

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract double getDiscountRate();

    public abstract void setDiscountsRate(double discountRate);

    public abstract double redeemPoint2Cash(int usePoints);

    public abstract void addPointFromBuyingTotalPrice(double buyingPrice);

}
