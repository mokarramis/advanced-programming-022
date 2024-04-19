import java.util.ArrayList;
public class Shop {
    ArrayList<Product> products = new ArrayList<Product>();
    public void addItem(Product product){
        this.products.add(product);
    }
}
