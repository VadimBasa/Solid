//принцип открытости/закрытости - разделение интерфейса Basket позволяет добавлять новые методы не изменяя остального кода

public class Purchase {
    protected String title;
    protected int count;
    Food food = new Food();
    protected Purchase[] purchases; // new Purchase[4] - магическое число 4 исправлено на определние количества методом products.size()

    public void setСountProducts(int countProducts) {
        purchases = new Purchase[countProducts];
    }

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Purchase() {
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }
    }
}

