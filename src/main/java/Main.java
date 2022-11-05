import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Purchase purchase = new Purchase();
        //принцип Liskov, наследники класса Product играют роль предка
        Food food = new Food();
        food.addProduct("Хлеб", 56);
        food.addProduct("Масло", 153);
        food.addProduct("Колбаса", 211);
        food.addProduct("Пирожок", 45);
        purchase.setСountProducts(food.products.size());

        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        //принцип единственной ответственности, класс Main не должен отвечать за печать, выносим в класс Purshase метод printPurshase()
        food.printProducts();


        System.out.println("Введите два слова: название товара и количество. Или end");
        try {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String line = scanner.nextLine();
                if ("end".equals(line)) break;
                String[] parts = line.split(" ");
                String product = parts[0];
                int count = Integer.parseInt(parts[1]);
                purchase.addPurchase(product, count);
            }
        } catch (Exception e) {
            System.out.println("Ошибка ввода.");
            throw new RuntimeException(e);
        }

        Calculation calculation = new Calculation(purchase.purchases);
        long sum = calculation.sum(food.products);

        System.out.println("ИТОГО: " + sum);
    }

    @Override
    public String toString() {
        return "Main []";
    }
}
