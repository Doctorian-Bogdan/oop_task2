package products;

public abstract class Food extends Product {
    public final String expirationDate;

    public Food(int id, String name, int price, String expirationDate) {
        super(id, name, price);
        this.expirationDate = expirationDate;
    }
}
