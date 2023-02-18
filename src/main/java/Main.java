import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataInitializer dataInitializer = new DataInitializer();
        Map products = dataInitializer.init();
        List<Object> shoppingCart = new ArrayList();
        workWithUser(products, shoppingCart);
    }
    public static void workWithUser(Map<Long, Object> products, List<Object> shoppingCart) {
        while (true) {
            System.out.println("Products we have:");
            products.values().forEach(System.out::println);
            Scanner getProductIdScanner = new Scanner(System.in);
            System.out.println("\nWrite product id to add product to shopping cart:");
            try {
                Long productId = Long.valueOf(getProductIdScanner.nextLine());
                Object product = products.get(productId);
                products.remove(productId);
                shoppingCart.add(product);
            } catch (Exception e) {
                System.out.println("You should write only correct id \n");
                workWithUser(products, shoppingCart);
            }
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Go to the shopping cart (Y/N):");
            String responseGoToShoppingCart = scanner1.nextLine();
            if (responseGoToShoppingCart.equals("Y")) {
                shoppingCart.stream().forEach(System.out::println);
                System.out.println("\n" + "press any key for return to store:");
                Scanner returnToShopScanner = new Scanner(System.in);
                String responseBackToStore = returnToShopScanner.nextLine();
                if (responseBackToStore.equals("Y")) {
                    workWithUser(products, shoppingCart);
                }
            } else {
                workWithUser(products, shoppingCart);
            }
        }
    }
}

