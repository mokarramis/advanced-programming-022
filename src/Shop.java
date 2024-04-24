import java.util.ArrayList;
public class Shop {
    ArrayList<Product> products = new ArrayList<Product>();
    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<Admin> admins = new ArrayList<>();
    ArrayList<Seller> sellers = new ArrayList<>();
    public void addItem(Product product){
        this.products.add(product);
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

    public void addAdmin(Admin admin){
        this.admins.add(admin);
    }

    public void addSeller(Seller seller){
        this.sellers.add(seller);
    }
}
