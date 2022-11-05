public interface Product { //принцип Liskov, наследники класса Product играют роль предка
    void addProduct(String product, int price);
}
