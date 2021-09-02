package cl.poc.polymorphism;

public class Order {

    private double orderAmount;
    private int quantity;
    private MyDate orderDate;
    private Good product;
    private String customer;

    public Order(double orderAmount, int quantity, MyDate orderDate, Good product, String customer) {
        this.orderAmount = orderAmount;
        this.quantity = quantity;
        this.orderDate = orderDate;
        this.product = product;
        this.customer = customer;
    }

    public Good getProduct() {
        return product;
    }

    public void setProduct(Good product) {
        this.product = product;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Order{");
        sb.append("orderAmount=").append(orderAmount);
        sb.append(", quantity=").append(quantity);
        sb.append(", orderDate=").append(orderDate);
        sb.append(", product=").append(product);
        sb.append(", customer='").append(customer).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
