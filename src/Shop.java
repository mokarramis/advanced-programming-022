import java.util.ArrayList;
public class Shop {
    ArrayList<Product> products = new ArrayList<Product>();
    ArrayList<Customer> customers = new ArrayList<>();
    public void addItem(Product product){
        this.products.add(product);
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }
}
