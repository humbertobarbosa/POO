package lista01.ex05;

import java.util.Date;
import java.util.ArrayList;

public class Order {
    private Date moment;
    private OrderStatus status;
    private ArrayList<OrderItem> items;
    private Client client;
    
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
        this.items = new ArrayList<>();
    }

    public Date getMoment() {
        return moment;
    }
    
    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<OrderItem> items) {
        this.items = items;
    }

    public Client getClient() {
        return client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    
    public void addItem(OrderItem item) {
        this.items.add(item);
        setItems(this.items);
    }

    public void removeItem(OrderItem item) {
        for (int i = 0; i < getItems().size(); i++) {
            OrderItem o = getItems().get(i);
            if (o.equals(item)) {
                this.items.remove(o);
                setItems(this.items);
                break;
            }
        }
    }

    public double total() {
        double total = 0;
        for (OrderItem it: getItems()) {
            total += it.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        String items = "";
        for (OrderItem it: getItems()) {
            items += String.format("%s, $%s, Quantity: %s, Subtotal: $%s\n", it.getProduct().getName(), it.getProduct().getPrice(), it.getQuantity(), it.subTotal());
        }
        return String.format("Order moment: %s\nOrder status: %s\nClient: %sOrder items:\n%sTotal price: $%s\n", getMoment(), getStatus(), getClient(), items, this.total());
    }
}
