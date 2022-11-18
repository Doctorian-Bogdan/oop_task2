package products;

public abstract class Cheese extends Food {
    public final String typeOfCheese;

    public Cheese(int id, String name, int price, String expirationDate, String typeOfCheese) {
        super(id, name, price, expirationDate);
        this.typeOfCheese = typeOfCheese;
    }
}
