package model;

public class OrderItem {

    Product product;
    double salesPrice;
    int quantity;

    public OrderItem(Product product, double salesPrice, int quantity) {
        this.product = product;
        this.salesPrice = salesPrice;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return this.product.toString();
    }
}
