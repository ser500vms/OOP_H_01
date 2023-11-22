import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrink("Capuchino", 150, 150, 40));
        productList.add(new HotDrink("Latte", 200, 150, 35));
        productList.add(new HotDrink("Esspreso", 100, 50, 50));
        productList.add(new HotDrink("Makiato", 250, 200, 36));
        productList.add(new HotDrink("Capuchino", 200, 200, 40));

        HotDrinkMachine vendingMachine = new HotDrinkMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("Esspreso", 50, 50));
    }
}