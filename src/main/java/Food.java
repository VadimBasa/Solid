import java.util.Map;
import java.util.HashMap;

public class Food implements Product {//правило Liskov, наследник Food полностью выполняет роль предка Product
    protected String product;
    protected int price;
    protected int countProducts;

    protected Map<String, Integer> products; // создаем объект Map, вместо HashMap

    public Food() {
        this.product = product;
        this.price = price;
        this.products = new HashMap<>();
    }

    public void printProducts() {
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
    }

    @Override
    public void addProduct(String product, int price) {
        products.put(product, price);
        countProducts++;
    }
}

