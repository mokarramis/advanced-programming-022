import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Shop shop = new Shop();
        ArrayList<Category> categories = new ArrayList<>();
        categories.add(Category.CPU);
        categories.add(Category.GPU);
        categories.add(Category.FOOD);
        Product product = new Product("phone", "12px", "1200", categories , Category.PHONE);
        System.out.println(product.category);
        System.out.println(product.getAllProducts());
        shop.addItem(product);
        shop.addCustomer(new Customer("ali" , "sobhi" , "1234" , new Wallet(12)));
        System.out.println(shop.customers.get(0).getWallet().getCredit());
        System.out.println(shop.customers.get(0).getUsers());
        // System.out.println(User.);
        shop.addAdmin(new Admin("kia" , "omid" , "1234" , Expertise.ServerContoler ));
        System.out.println(shop.admins.get(0).getUsers());
        shop.addAdmin(new Admin("hassan" , "sabbah" , "0110" , Expertise.TeachnicalManager ));
        shop.addSeller(new Seller ("Omar" , "khayam" , "1210"));

        System.out.println(shop.sellers.get(0).getUsers());
        shop.sellers.get(0).addProduct(product) ;
        shop.sellers.get(0).addProduct(new Product("quatrains", "60px", "120", categories , Category.BOOK)) ;
        System.out.println(shop.sellers.get(0).getProductsToSale());
        shop.customers.get(0).addProductToCart(product);
        shop.customers.get(0).addProductToCart(new Product("quatrains", "60px", "120", categories , Category.BOOK));
        System.out.println(shop.customers.get(0).getShoppingCart());
        System.out.println(shop.customers.get(0).ToPay());


//        System.out.println(shop.products.get(0).getCategories());

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret ast the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}