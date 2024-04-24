import java.util.ArrayList;
import java.util.List;

public class Seller extends User {

    // developed by Alireza Sobhdoost
    
    private List<Product> ProductsToSale  ;

    private int UserNumber = 3000 ;

    public Seller (String firstName, String lastName, String password  ) {

        super(firstName, lastName, password);
        this.UserNumber = UserNumber + User.generateUserNumber() ;
        ProductsToSale  = new ArrayList<>() ;

    }

    public void addProduct (Product product) {

        this.ProductsToSale.add(product) ;

    }

    public List<Product> getProductsToSale() {
        return ProductsToSale ;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "firstName='" + this.firstName + '\'' +
                ", lastName='" + this.lastName + '\'' +
                ", password='" + getPassword() + '\'' +
                ", numberOfProducts=" + this.ProductsToSale.size() + '\'' +
                ", usernumber=" + this.UserNumber+
                '}';
    }
    
}
