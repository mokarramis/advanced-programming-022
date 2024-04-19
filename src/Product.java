import java.util.ArrayList;
import java.util.List;
public class Product {
    private String name, size, price;
    private List<Category> categories = new ArrayList<Category>();
    private ArrayList<Product> allProducts;
    public Product(String name, String size, String price, List<Category> categories){
        this.name = name;
        this.size = size;
        this.price = price;
        this.categories = addCategoties(categories);
        allProducts = new ArrayList<>();
        allProducts.add(this);
    }
    public ArrayList<Product> getAllProducts() {
        return allProducts;
    }
    public String getName() {
        return this.name;
    }

    // created by Arian Rahmatpour
    public List<Category> addCategoties(List<Category> categories) {
        for (Category item : categories) {
            this.categories.add(item);
        }
        return this.categories;
    }
    public String getPrice() {
        return price;
    }
    public String getSize() {
        return size;
    }
    public Product show(){
        return  this;
    }
    public List<Category> getCategories() {
        return categories;
    }
}
