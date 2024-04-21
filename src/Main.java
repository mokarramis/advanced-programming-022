import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Shop shop = new Shop();
        ArrayList<Category> categories = new ArrayList<>();
        categories.add(Category.CPU);
        categories.add(Category.GPU);
        categories.add(Category.FOOD);
        Product product = new Product("phone", "12px", "1200$", categories);
        System.out.println(product.getAllProducts());
        shop.addItem(product);
        shop.addCustomer(new Customer(new Wallet()));
        System.out.println(shop.customers.get(0).getWallet().getCredit());

//        System.out.println(shop.products.get(0).getCategories());

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}