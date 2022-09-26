package lista01.ex05;

public class OrderItem {
    private int quantity;
    private double price;
    private Product product;

    public OrderItem(int quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal() {
        return getQuantity() * getPrice();
    }
    
    @Override
    public String toString() {
        return String.format("%s, %s, Quantity: %s, Subtotal: $%s\n",product.getName(), product.getPrice(), getQuantity(), subTotal());
    }
}
