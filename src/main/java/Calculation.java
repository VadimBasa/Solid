import java.util.Map;

public class Calculation {//принцип единственной ответственности - выносим из класса Purshase метод sum в отдельный класс
    protected Purchase[] purchases;

    public Calculation(Purchase[] purchases) {
        this.purchases = purchases;
    }

    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.length; i++) {
            Purchase purchase = purchases[i];
            if (purchase == null) continue;
            System.out.println("\t" + purchase.title + " " + purchase.count + " шт. в сумме " + (purchase.count * prices.get(purchase.title)) + " руб.");
            sum += purchase.count * prices.get(purchase.title);
        }
        return sum;
    }
}