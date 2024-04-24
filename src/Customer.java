import java.util.ArrayList;
import java.util.List;

public class Customer extends User {

    // developed by Alireza Sobhdoost
    
    private Wallet wallet;
    private int UserNumber = 1000;
    private List<Product> ShoppingCart ; 

    public Customer(String firstName, String lastName, String password, Wallet wallet) {
        super(firstName, lastName, password);
        this.wallet = wallet;
        this.UserNumber = UserNumber + User.generateUserNumber();
        ShoppingCart = new ArrayList<>() ;

        // Users.add(this);
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void addProductToCart (Product product) {
        this.ShoppingCart.add(product) ;
    }

    public List<Product> getShoppingCart() {
        return ShoppingCart ;
    }

    public int ToPay () {
        int money_sould_br_payed = 0 ;
        for (Product product : ShoppingCart) {
            money_sould_br_payed += Integer.parseInt(product.getPrice());
        }
        return money_sould_br_payed ;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + this.firstName + '\'' +
                ", lastName='" + this.lastName + '\'' +
                ", password='" + getPassword() + '\'' +
                ", wallet=" + this.wallet + '\'' +
                ", usernumber=" + this.UserNumber+
                '}';
    }
}